/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelibrary;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import java.util.HashMap; // import the HashMap class
import java.util.Scanner; // import the Scanner class
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

/**
 *
 * @author ablo1
 */
public class GameLibrary {
    
    //public ObjectMapper mapper = new ObjectMapper();
    private String name;
    private Manager manager = new Manager(null, null);
    private static ArrayList<VideoGame> videoGameList = new ArrayList<VideoGame>();
    private static ArrayList<Toy> toyList = new ArrayList<Toy>();
    private static ArrayList<BoardGame> boardGameList = new ArrayList<BoardGame>();
    private static ArrayList<Adherent> adherentList = new ArrayList<Adherent>();
    //private ArrayList<Map<String, ArrayList<Game>>> gamesJson;

    public GameLibrary(String name) {
        this.name = name;
    }
        
    public String getName() {
        return name;
    }

    public static ArrayList<VideoGame> getVideoGameList() {
        return videoGameList;
    }

    public static ArrayList<Toy> getToyList() {
        return toyList;
    }

    public static ArrayList<BoardGame> getBoardGameList() {
        return boardGameList;
    }

    public static ArrayList<Adherent> getAdherentList() {
        return adherentList;
    }
        
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
    /*public void init() throws JsonProcessingException{
        try (FileReader reader = new FileReader("D:\\Ablo_Doss\\Ecole\\4eme_5eme\\Q1\\Architecture_logicielle\\Test driven développement\\Ludotheque\\GameLibrary\\src\\gamelibrary\\Games.json"))
        {
            //Read JSON file
            gamesJson = mapper.readValue(reader, ArrayList.class);
            //System.out.println(gamesJson.get(0).get("videoGame"));
            this.videoGameList = gamesJson.get(0).get("videoGame");
            this.boardGameList = gamesJson.get(1).get("videoGame");
            this.toyList = gamesJson.get(2).get("videoGame");
            
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }*/
   
    
   
}
