package driver;

import animal.Aligator;
import animal.Animal;
import animal.AnimalHandler;
import animal.BadakCulaSatu;
import animal.Banteng;
import animal.Bekantan;
import animal.Buaya;
import animal.Elang;
import animal.Garuda;
import animal.HarimauSumatra;
import animal.HiuKarpet;
import animal.HiuMartil;
import animal.Iguana;
import animal.KakakTua;
import animal.Kancil;
import animal.Komodo;
import animal.Macan;
import animal.MantaRay;
import animal.Nuri;
import animal.OrangUtan;
import animal.Parkit;
import animal.Rusa;
import animal.Siamang;
import animal.StingRay;
import animal.Zebra;
import cage.Cage;
import cage.CageHandler;
import cell.AirHabitat;
import cell.Cell;
import cell.Entrance;
import cell.Exit;
import cell.LandHabitat;
import cell.Park;
import cell.Restaurant;
import cell.Road;
import cell.WaterHabitat;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import zoo.Zoo;

/**
 * @author Jehian Norman Saviero.
 */

public class Driver {
  private int currX;
  private int currY;
  private boolean[][] visited;
  private int mapWidth;
  private int mapLength;

  /**
   * Konstruktor untuk kelas Driver.
   */
  public Driver() {
    try {
      FileReader fin = null;
      JSONParser parser = new JSONParser();
      fin = new FileReader("resources/map.json");
      JSONObject obj = (JSONObject) parser.parse(fin);
      mapWidth = new Long((long) obj.get("ZooWidth")).intValue();
      mapLength = new Long((long) obj.get("ZooLength")).intValue();
      fin.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }
    visited = new boolean[mapLength][mapWidth];
  }

  /**
   * Menentukan Animal jenis apa yang akan dibentuk.
   * @param abs posisi abs dari animal.
   * @param ord posis ord dari animal.
   * @param massa massa dari animal.
   * @param nama nama spesies dari animal.
   * @param jinak kejinakan dari animal.
   * @param id is dari animal.
   * @return animal yang telah dibentuk.
   */
  private Animal animalBuilder(int absis, int ordinat, int massa, String nama,
      boolean jinak, int id) {
    Animal animalCreated = null;
    if (nama.equals("Elang")) {
      animalCreated = new Elang(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Bekantan")) {
      animalCreated = new Bekantan(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("BadakCulaSatu")) {
      animalCreated = new BadakCulaSatu(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Buaya")) {
      animalCreated = new Buaya(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Rusa")) {
      animalCreated = new Rusa(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Parkit")) {
      animalCreated = new Parkit(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Garuda")) {
      animalCreated = new Garuda(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("HarimauSumatra")) {
      animalCreated = new HarimauSumatra(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Iguana")) {
      animalCreated = new Iguana(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Komodo")) {
      animalCreated = new Komodo(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Kancil")) {
      animalCreated = new Kancil(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Aligator")) {
      animalCreated = new Aligator(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Macan")) {
      animalCreated = new Macan(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Nuri")) {
      animalCreated = new Nuri(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Kakatua")) {
      animalCreated = new KakakTua(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("MantaRay")) {
      animalCreated = new MantaRay(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Siamang")) {
      animalCreated = new Siamang(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("HiuMartil")) {
      animalCreated = new HiuMartil(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("OrangUtan")) {
      animalCreated = new OrangUtan(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("HiuKarpet")) {
      animalCreated = new HiuKarpet(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("StingRay")) {
      animalCreated = new StingRay(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Zebra")) {
      animalCreated = new Zebra(id, absis, ordinat, massa, jinak);
    } else if (nama.equals("Banteng")) {
      animalCreated = new Banteng(id, absis, ordinat, massa, jinak);
    }
    return animalCreated;
  }

  /**
   * Method untuk memparsing animal dari file external.
   * @param zoo merepresentasikan kelas Zoo.
   * @return animalHandler yang telah terisi animal.
   */
  public AnimalHandler parseAnimal(Zoo zoo) {
    AnimalHandler animalHandler = new AnimalHandler();
    try {
      FileReader fin = null;
      JSONParser parser = new JSONParser();

      fin = new FileReader("resources/map.json");
      JSONObject obj = (JSONObject) parser.parse(fin);

      JSONArray animalArray = (JSONArray) obj.get("AnimalList");
      Iterator<JSONObject> allAnimal = animalArray.iterator();

      int absis;
      int ordinat;
      int massa;
      String nama;
      boolean jinak;
      int id;
      while (allAnimal.hasNext()) {
        JSONObject currAnimal = (JSONObject) allAnimal.next();
        JSONObject lokasi = (JSONObject) currAnimal.get("Lokasi");
        absis = new Long((long) lokasi.get("x")).intValue();
        ordinat = new Long((long) lokasi.get("y")).intValue();
        nama = (String) currAnimal.get("Spesies");
        massa = new Long((long) currAnimal.get("Massa")).intValue();
        id = new Long((long) currAnimal.get("Id")).intValue();
        jinak = (boolean) currAnimal.get("Jinak");

        Animal animal = animalBuilder(absis, ordinat, massa, nama, jinak, id);
        animalHandler.addAnimal(animal);
        zoo.getCell(absis, ordinat).setAnimal(animal);
        if (zoo.getCell(absis, ordinat).getCage() != null) {
          zoo.getCell(absis, ordinat).getCage().addAnimal(animal);
        } else {
          System.out.println(absis + " " + ordinat);
        }
      }
      fin.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return animalHandler;
  }

  /**
   * Method untuk memparsing cage dari file external.
   * @return CageHandler yang telah terisi.
   */
  public CageHandler parseCage() {
    CageHandler cageHandler = new CageHandler();
    try {
      FileReader fin = null;
      JSONParser parser = new JSONParser();

      fin = new FileReader("resources/map.json");
      JSONObject obj = (JSONObject) parser.parse(fin);

      JSONArray cageArray = (JSONArray) obj.get("CageList");
      Iterator<JSONObject> allCage = cageArray.iterator();

      char habitat;
      int id;
      while (allCage.hasNext()) {
        JSONObject currCage = (JSONObject) allCage.next();
        habitat = new String((String) currCage.get("Habitat")).charAt(0);
        id = new Long((long) currCage.get("Id")).intValue();
        cageHandler.addCage(new Cage(id,habitat));
      }
      fin.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return cageHandler;
  }

  /**
   * Method untuk memparsing cell dari file external.
   * @param cageHandler CageHandler.
   * @return Zoo yangtelah terisi cell.
   */
  public Zoo parseCell(CageHandler cageHandler) {
    Zoo zoo = null;
    try {
      FileReader fin = null;
      JSONParser parser = new JSONParser();

      fin = new FileReader("resources/map.json");
      JSONObject obj = (JSONObject) parser.parse(fin);

      JSONArray cellArray = (JSONArray) obj.get("CellList");
      Iterator<JSONObject> allCell = cellArray.iterator();

      Cage cage;
      int absis;
      int ordinat;
      String type;
      boolean entrance;
      boolean exit;

      zoo = new Zoo(mapLength,mapWidth);
      while (allCell.hasNext()) {
        JSONObject currCell = (JSONObject) allCell.next();
        JSONObject lokasi = (JSONObject) currCell.get("Lokasi");
        absis = new Long((long) lokasi.get("x")).intValue();
        ordinat = new Long((long) lokasi.get("y")).intValue();
        type = (String) currCell.get("type");
        int cageId = new Long((long) currCell.get("Cage")).intValue();
        Cell sel = null;

        if (type.equals("water")) {
          sel = new WaterHabitat(absis,ordinat);
        } else if (type.equals("land")) {
          sel = new LandHabitat(absis,ordinat);
        } else if (type.equals("air")) {
          sel = new AirHabitat(absis,ordinat);
        } else if (type.equals("road")) {
          entrance = (boolean) currCell.get("entrance");
          exit = (boolean) currCell.get("exit");
          if (entrance) {
            sel = new Entrance(absis,ordinat);
            zoo.addEntrance(sel);
          } else if (exit) {
            sel = new Exit(absis,ordinat);
            zoo.addExit(sel);
          } else {
            sel = new Road(absis,ordinat);
          }
        } else if (type.equals("park")) {
          sel = new Park(absis,ordinat);
        } else if (type.equals("restaurant")) {
          sel = new Restaurant(absis,ordinat);
        }
        zoo.setCell(absis,ordinat,sel);
        if (cageId > 0) {
          cage = cageHandler.getCage(cageId);
          cage.addCell(sel.getType());
        } else {
          cage = null;
        }
        zoo.getCell(absis, ordinat).setCage(cage);
      }
      fin.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return zoo;
  }

  /**
   * Method untuk menampilkan virtual zoo pada layar.
   * @param zoo yang akan ditampilkan layar.
   */
  public void displayVirtualZoo(Zoo zoo) {
    System.out.println("Input left position : ");
    Scanner reader = new Scanner(System.in);
    int left;
    left = reader.nextInt();
    System.out.println("Input up position : ");
    int up;
    up = reader.nextInt();
    System.out.println("Input right position : ");
    int right;
    right = reader.nextInt();
    System.out.println("Input down position : ");
    int down;
    down = reader.nextInt();
    System.out.println("==================================================");
    System.out.println("              V I R T U A L  Z O O");
    System.out.println("==================================================");

    if (left >= 0 && up >= 0 && right < zoo.getWidth() && down < zoo.getLength()) {
      for (int i = up; i <= down; i++) {
        for (int j = left; j <= right; j++) {
          if (zoo.getCell(j,i).getAnimal() == null) {
        	System.out.print(zoo.getCell(j, i).getType());
          } else {
        	System.out.print(zoo.getCell(j,i).getAnimal().getInisial());
          }
        }
        System.out.println();
      }
    }
  }

  /**
   * Method untuk mengisnisiasi tour.
   * @param zoo yang akan dilakukan tour.
   */
  public void initPosition(Zoo zoo) {
    Random rand = new Random(System.currentTimeMillis());
    int idx = rand.nextInt(2);
    currX = 4;
    currY = 0;
    System.out.print(currX + " " + currY);
    for (int i = 0; i < zoo.getLength(); i++) {
      for (int j = 0; j < zoo.getWidth(); j++) {
        visited[i][j] = false;
      }
    }
  }

  public int getPosX() {
    return currX;
  }

  public int getPosY() {
    return currY;
  }

  /**
   * Method untuk melakukan tour virtual zoo.
   * @param zoo yang akan dilakukan tour.
   */
  public void tourVirtualZoo(Zoo zoo) {
    Random rand = new Random(System.currentTimeMillis());

    System.out.println("==================================================");
    System.out.println("                 VIRTUAL ZOO TOUR");
    System.out.println("==================================================");
    boolean finish = false;
    while (!finish) {
      int init = rand.nextInt(4);
      boolean found = false;
      int i = 0;

      while (!found && i < 4) {
        if (init == 0) {
          if ((currY - 1 >= 0) && (zoo.getCell(currX, currY - 1).getType() == ' ')
              && (!visited[currY - 1][currX])) {
            found = true;
            visited[currY][currX] = true;
            currY--;
          } else {
            init++;
          }
        } else if (init == 1) {
          if ((currX + 1 < zoo.getWidth()) && (zoo.getCell(currX + 1, currY).getType() == ' ')
              && (!visited[currY][currX + 1])) {
            found = true;
            visited[currY][currX] = true;
            currX++;
          } else {
            init++;
          }
        } else if (init == 2) {
          if ((currY + 1 < zoo.getLength()) && (zoo.getCell(currX, currY + 1).getType() == ' ')
              && (!visited[currY + 1][currX])) {
            found = true;
            visited[currY][currX] = true;
            currY++;
          } else {
            init++;
          }
        } else if (init == 3) {
          if ((currX - 1 >= 0) && (zoo.getCell(currX - 1, currY).getType() == ' ')
              && (!visited[currY][currX - 1])) {
            found = true;
            visited[currY][currX] = true;
            currX--;
          } else {
            init = 0;
          }
        }
        if (!found) {
          i++;
        }
      }
      if (!found) {
        finish = true;
        System.out.println("No next move found");
      } else {
        System.out.println("You're in: " + currX + " " + currY);
        if (currY - 1 >= 0 && zoo.getCell(currX, currY - 1).getAnimal() != null) {
          zoo.getCell(currX, currY - 1).getAnimal().interact();
        }
        if (currX - 1 >= 0 && zoo.getCell(currX - 1, currY).getAnimal() != null) {
          zoo.getCell(currX - 1, currY).getAnimal().interact();
        }
        if (currY + 1 < zoo.getLength() && zoo.getCell(currX, currY + 1).getAnimal() != null) {
          zoo.getCell(currX, currY + 1).getAnimal().interact();
        }
        if (currX + 1 < zoo.getWidth() && zoo.getCell(currX + 1, currY).getAnimal() != null) {
          zoo.getCell(currX + 1, currY).getAnimal().interact();
        }
        for (i = 0; i < zoo.nbExit(); i++) {
          if (zoo.getExit(i).getAbsis() == currX && zoo.getExit(i).getOrdinat() == currY) {
            finish = true;
            System.out.println("You are in an exit!");
          }
        }
      }
    }
  }

  /**
   * Method untuk melakukan perpindahan animal.
   * @param zoo tempat animal berada.
   * @param animalHandler pengatur object-object animal.
   */
  public void moveAnimal(Zoo zoo, AnimalHandler animalHandler) {
    Random rand = new Random(System.currentTimeMillis());
    for (int i = 0; i < animalHandler.nbAnimal(); i++) {
      int init = rand.nextInt(4);
      int x = animalHandler.getAnimal(i).getPosisiX();
      int y = animalHandler.getAnimal(i).getPosisiY();
      int cage = zoo.getCell(x, y).getCage().getId();

      if (init == 0) {
        if (y - 1 >= 0 && zoo.getCell(x, y - 1).getCage() != null
            && zoo.getCell(x, y - 1).getCage().getId() == cage
            && zoo.getCell(x, y - 1).getAnimal() == null) {
          animalHandler.getAnimal(i).setY(y - 1);
          zoo.getCell(x, y).setAnimal(null);
          zoo.getCell(x, y - 1).setAnimal(animalHandler.getAnimal(i));
        }
      } else if (init == 1) {
        if (x + 1 < zoo.getWidth() && zoo.getCell(x + 1, y).getCage() != null
            && zoo.getCell(x + 1, y).getCage().getId() == cage
            && zoo.getCell(x + 1, y).getAnimal() == null) {
          animalHandler.getAnimal(i).setX(x + 1);
          zoo.getCell(x, y).setAnimal(null);
          zoo.getCell(x + 1, y).setAnimal(animalHandler.getAnimal(i));
        }
      } else if (init == 2) {
        if (y + 1 < zoo.getLength() && zoo.getCell(x, y + 1).getCage() != null
            && zoo.getCell(x, y + 1).getCage().getId() == cage
            && zoo.getCell(x, y + 1).getAnimal() == null) {
          animalHandler.getAnimal(i).setY(y + 1);
          zoo.getCell(x, y).setAnimal(null);
          zoo.getCell(x, y + 1).setAnimal(animalHandler.getAnimal(i));
        }
      } else if (init == 3) {
        if (x - 1 >= 0 && zoo.getCell(x - 1, y).getCage() != null
            && zoo.getCell(x - 1, y).getCage().getId() == cage
            && zoo.getCell(x - 1, y).getAnimal() == null) {
          animalHandler.getAnimal(i).setX(x - 1);
          zoo.getCell(x, y).setAnimal(null);
          zoo.getCell(x - 1, y).setAnimal(animalHandler.getAnimal(i));
        }
      }
    }
  }
}
