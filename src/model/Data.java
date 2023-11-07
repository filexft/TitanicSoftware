/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lycee
 */
public class Data {
    private ArrayList<Passager> listPassager;
    public Data(){
        listPassager = new ArrayList<>();
        
        try{
            Scanner sc = new Scanner(new File("titanic.dbf"));
            int buf = 5;
            String id = "";
            int clas = 0, ag = 0, sex = 0, surviv = 0;
            int pack = 5;
            while(sc.hasNext()){
                if(buf == 0){
                    
                    
                    switch(pack){
                        
                        case 5:
                            pack--;
                            id = sc.next();
                            break;
                        case 4:
                            pack--;
                            clas = Integer.parseInt(sc.next());
                            break;
                        case 3:
                            pack--;
                            ag = Integer.parseInt(sc.next());
                            break;
                        case 2:
                            pack--;
                            sex = Integer.parseInt(sc.next());
                            break;
                        case 1:
                            pack = 5;
                            surviv = Integer.parseInt(sc.next());
                            Passager pass = new Passager(id, clas, ag, sex, surviv);
                            listPassager.add(pass);
                            break;
                        default:
                            break;
                    }
                }else{
                    buf--;
                    sc.nextLine();
                }
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    
    public ArrayList<Passager> getData(){
        return listPassager;
    }
    
    
    
}
