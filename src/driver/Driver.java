package driver;

import animal.*;
import cage.*;
import cell.*;
import java.util.*;
import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import zoo.*;

/**
 * @author Jehian Norman Saviero.
 */

public class Driver {
  private int currX;
  private int currY;
  private boolean visited[][];
  private int mapWidth;
  private int mapLength;

  public Driver() {
    try {
      FileReader fin = null;
      JSONParser parser = new JSONParser();
      fin = new FileReader("src/main/resource/map.json"); 
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

  private Animal animalBuilder(int absis, int ordinat, int massa, String nama, boolean jinak, int id) {
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
  
  public AnimalHandler parseAnimal(Zoo zoo){
    AnimalHandler animalHandler = new AnimalHandler();
    try{
      FileReader fin = null;
      JSONParser parser = new JSONParser();
      
      fin = new FileReader("src/main/resource/map.json"); 
      JSONObject obj = (JSONObject) parser.parse(fin);

      JSONArray animalArray= (JSONArray) obj.get("AnimalList");
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
                if(zoo.getCell(absis, ordinat).getCage() != null)
                  zoo.getCell(absis, ordinat).getCage().addAnimal(animal);
                else 
                  System.out.println(absis + " "+ ordinat);
            }
            fin.close();
    } 
    catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    catch (IOException e) {
            e.printStackTrace();
        } 
    catch (ParseException e) {
            e.printStackTrace();
        }
    return animalHandler;
  }
  
  public CageHandler parseCage(){
    CageHandler cageHandler= new CageHandler();
    try{
      FileReader fin= null;
      JSONParser parser = new JSONParser();
      
      fin= new FileReader("src/main/resource/map.json"); 
      JSONObject obj = (JSONObject) parser.parse(fin);

      JSONArray cageArray= (JSONArray) obj.get("CageList");
      Iterator<JSONObject> allCage = cageArray.iterator();
    
      char habitat;
      int id;
            while (allCage.hasNext()) {
              JSONObject currCage= (JSONObject) allCage.next();
              habitat= new String((String) currCage.get("Habitat")).charAt(0);
                id= new Long((long) currCage.get("Id")).intValue();
                
                cageHandler.addCage(new Cage(id,habitat));
            }
            fin.close();
    } 
    catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    catch (IOException e) {
            e.printStackTrace();
        } 
    catch (ParseException e) {
            e.printStackTrace();
        }
    return cageHandler;
  }
  
  public Zoo parseCell(CageHandler cageHandler) {
    Zoo zoo = null;
    try{
      FileReader fin= null;
      JSONParser parser = new JSONParser();
      
      fin= new FileReader("src/main/resource/map.json"); 
      JSONObject obj = (JSONObject) parser.parse(fin);

      JSONArray cellArray= (JSONArray) obj.get("CellList");
      Iterator<JSONObject> allCell = cellArray.iterator();
      
      Cage cage;
      int absis;
      int ordinat;
      String type;
      boolean entrance, exit;
      
      zoo = new Zoo(mapLength,mapWidth);
      
            while (allCell.hasNext()) {
              JSONObject currCell = (JSONObject) allCell.next();
              JSONObject lokasi = (JSONObject) currCell.get("Lokasi");
              absis = new Long((long) lokasi.get("x")).intValue();
              ordinat = new Long((long) lokasi.get("y")).intValue();
              type = (String) currCell.get("type");
              int cageID = new Long((long) currCell.get("Cage")).intValue();
              
              Cell sel = null;
              
            if(type.equals("water")) {
              sel = new WaterHabitat(absis,ordinat);
            } else if(type.equals("land")) {
              sel = new LandHabitat(absis,ordinat);
            } else if(type.equals("air")) {
              sel = new AirHabitat(absis,ordinat);
            } else if(type.equals("road")) {
              entrance = (boolean) currCell.get("entrance");
                  exit = (boolean) currCell.get("exit");
              if(entrance) {
                sel = new Entrance(absis,ordinat);
                zoo.addEntrance(sel);
              } else if(exit){
                sel = new Exit(absis,ordinat);
                zoo.addExit(sel);
              } else {
                sel = new Road(absis,ordinat);
              }
            } else if(type.equals("park")) {
              sel = new Park(absis,ordinat);
            } else if(type.equals("restaurant")) {
              sel = new Restaurant(absis,ordinat);
            }
            z.setCell(absis,ordinat,sel);
            if(cageID > 0) {
                cage = cageHandler.getCage(cageID);
                cage.addCell(sel.getType());
              }
              else {
                cage = null;
              }
            zoo.getCell(absis, ordinat).setCage(cage);
            }
            fin.close();
    } 
    catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    catch (IOException e) {
            e.printStackTrace();
        } 
    catch (ParseException e) {
            e.printStackTrace();
        }
    return z;
  }
  
  public void displayVirtualZoo(Zoo z) {
    int left, right, up, down;
    System.out.println("Input left position : ");
    Scanner reader = new Scanner(System.in);
    left = reader.nextInt();
    System.out.println("Input up position : ");
    up = reader.nextInt();
    System.out.println("Input right position : ");
    right = reader.nextInt();
    System.out.println("Input down position : ");
    down = reader.nextInt();
    System.out.println("==================================================");
    System.out.println("              V I R T U A L  Z O O");
    System.out.println("==================================================");
    if(left >= 0 && up >= 0 && right < z.getWidth() && down < z.getLength()){
      for (int i = up; i <= down; i++) {
        for (int j = left; j <= right; j++) {
          z.getCell(j,i).render();
        }
        System.out.println();
      }
    }
  }
  
  public void initPosition(Zoo z){
    Random rand = new Random(System.currentTimeMillis());
    int idx = rand.nextInt(z.nbEntrance());
    currX = z.getEntrance(idx).getAbsis();
    currY = z.getEntrance(idx).getOrdinat();
    
    for(int i = 0; i < z.getLength(); i++) {
      for(int j = 0; j < z.getWidth(); j++) {
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
  
  public void tourVirtualZoo(Zoo zoo) {
    Random rand = new Random(System.currentTimeMillis());
    boolean finish = false;
    
    System.out.println("==================================================");
    System.out.println("                 VIRTUAL ZOO TOUR");
    System.out.println("==================================================");
    
    while (!finish) {
      int init = rand.nextInt(4);
      boolean found = false;
      int i = 0;
      
      while (!found && i < 4) {
        if (init == 0){
          if ((currY-1 >= 0) && (zoo.getCell(currX, currY-1).getType() == ' ') 
              && (!visited[currY-1][currX])) {
            found = true;
            visited[currY][currX] = true;
            currY--;
          } else {
            init++;
          }
        } else if(init == 1){
          if ((currX+1 < zoo.getWidth()) && (zoo.getCell(currX+1, currY).getType() == ' ') 
              && (!visited[currY][currX+1])) {
            found = true;
            visited[currY][currX] = true;
            currX++;
          } else {
            init++;
          }
        } else if (init == 2){
          if ((currY+1 < zoo.getLength()) && (zoo.getCell(currX, currY+1).getType() == ' ') 
              && (!visited[currY+1][currX])) {
            found = true;
            visited[currY][currX] = true;
            currY++;
          } else {
            init++;
          }
        } else if (init == 3) {
          if ((currX-1 >= 0) && (zoo.getCell(currX-1, currY).getType() == ' ') 
              && (!visited[currY][currX-1])) {
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
        System.out.println("You're in: "+ currX + " " + currY);
        if (currY-1 >= 0 && z.getCell(currX, currY-1).getAnimal() != null){
          zoo.getCell(currX, currY-1).getAnimal().interact();
        }
        if (currX-1 >= 0 && z.getCell(currX-1, currY).getAnimal() != null){
          zoo.getCell(currX-1, currY).getAnimal().interact();
        }
        if (currY+1 < z.getLength() && zoo.getCell(currX, currY+1).getAnimal() != null){
          zoo.getCell(currX, currY+1).getAnimal().interact();
        }
        if (currX+1 < z.getWidth() && zoo.getCell(currX+1, currY).getAnimal() != null){
          zoo.getCell(currX+1, currY).getAnimal().interact();
        }
        for (i = 0; i < z.nbExit(); i++){
          if (zoo.getExit(i).getAbsis() == currX && zoo.getExit(i).getOrdinat() == currY){
            finish = true;
            System.out.println("You are in an exit!");
          }
        }
      }
    }
  }
  
  public void moveAnimal(Zoo zoo, AnimalHandler animalHandler) {
    Random rand = new Random(System.currentTimeMillis());
    for (int i = 0; i < ah.nbAnimal(); i++){
      int init = rand.nextInt(4);
      int x = animalHandler.getAnimal(i).getPosisiX();
      int y = animalHandler.getAnimal(i).getPosisiY();
      int cage = zoo.getCell(x, y).getCage().getId();

      if (init == 0) {
        if (y-1 >= 0 && zoo.getCell(x, y-1).getCage() != null && zoo.getCell(x, y-1).getCage().getId() == cage 
            && zoo.getCell(x, y-1).getAnimal() == null) {
          animalHandler.getAnimal(i).setY(y-1);
          zoo.getCell(x, y).setAnimal(null);
          zoo.getCell(x, y-1).setAnimal(ah.getAnimal(i));
        }
      } else if (init == 1) {
        if (x+1 < zoo.getWidth() && zoo.getCell(x+1, y).getCage() != null && zoo.getCell(x+1, y).getCage().getId() == cage 
            && zoo.getCell(x+1, y).getAnimal() == null) {
          animalHandler.getAnimal(i).setX(x+1);
          zoo.getCell(x, y).setAnimal(null);
          zoo.getCell(x+1, y).setAnimal(ah.getAnimal(i));
        }
      } else if (init == 2) {
        if (y+1 < zoo.getLength() && zoo.getCell(x, y+1).getCage() != null && zoo.getCell(x, y+1).getCage().getId() == cage 
            && zoo.getCell(x, y+1).getAnimal() == null) {
          animalHandler.getAnimal(i).setY(y+1);
          zoo.getCell(x, y).setAnimal(null);
          zoo.getCell(x, y+1).setAnimal(ah.getAnimal(i));
        }
      } else if (init == 3) {
        if (x-1 >= 0 && zoo.getCell(x-1, y).getCage() != null && zoo.getCell(x-1, y).getCage().getId() == cage 
            && zoo.getCell(x-1, y).getAnimal() == null) {
          animalHandler.getAnimal(i).setX(x-1);
          zoo.getCell(x, y).setAnimal(null);
          zoo.getCell(x-1, y).setAnimal(ah.getAnimal(i));
        }
      }
    } 
  }
}
