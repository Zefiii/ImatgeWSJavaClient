/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatgewsjavaclient;
import java.util.ArrayList;
import java.util.List;
import org.me.imatge.Imatge;

/**
 *
 * @author Oriol
 */
public class ImatgeWSJavaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //registImageFunc();
        //listImageFunc();
        //modifImageFunc();
        //searchIDFunc();
        //searchTitleFunc();
        //searchDateFunc();
        //searchAutorFunc();
        searchKeyFunc();
    }
    private static void searchKeyFunc(){
       List<Imatge> images; 
       images = searchByKeywords("Vermell");
       int n = images.size();
       for(int i = 0; i < n; ++ i){
           Imatge im = images.get(i);    
           System.out.println("Id: " + im.getId());
           System.out.println("Autor: " + im.getAutor());
           System.out.println("Titol: " + im.getTitol());
           System.out.println("Descripcio: " + im.getDescripcio());
           System.out.println("Data de creacio: " + im.getDataCreacio());
        }
    }
    private static void searchAutorFunc(){
        List<Imatge> images; 
       images = searchByAutor("Oriol");
       int n = images.size();
       for(int i = 0; i < n; ++ i){
           Imatge im = images.get(i);    
           System.out.println("Id: " + im.getId());
           System.out.println("Autor: " + im.getAutor());
           System.out.println("Titol: " + im.getTitol());
           System.out.println("Descripcio: " + im.getDescripcio());
           System.out.println("Data de creacio: " + im.getDataCreacio());
        }
    }
    private static void registImageFunc(){
        Imatge im = new Imatge();
        im.setTitol("Post5 de Sol");
        im.setAutor("Oriol");
        im.setDataCreacio("25-10-2018");
        im.setKeywords("Sol Vermell");
        im.setDescripcio("Es una posta de sol molt maca");
        im.setId(85);
        registreImatge(im);
    }
    private static void searchTitleFunc(){
       List<Imatge> images; 
       images = searchByTitle("Postes bojes de Sol");
       int n = images.size();
       for(int i = 0; i < n; ++ i){
           Imatge im = images.get(i);    
           System.out.println("Id: " + im.getId());
           System.out.println("Autor: " + im.getAutor());
           System.out.println("Titol: " + im.getTitol());
           System.out.println("Descripcio: " + im.getDescripcio());
           System.out.println("Data de creacio: " + im.getDataCreacio());
        }
    }
    private static void searchDateFunc(){
        List<Imatge> images; 
       images = searchByDate("25-10-2018");
       int n = images.size();
       for(int i = 0; i < n; ++ i){
           Imatge im = images.get(i);    
           System.out.println("Id: " + im.getId());
           System.out.println("Autor: " + im.getAutor());
           System.out.println("Titol: " + im.getTitol());
           System.out.println("Descripcio: " + im.getDescripcio());
           System.out.println("Data de creacio: " + im.getDataCreacio());
        }
    }
    private static void searchIDFunc(){
        Imatge im = searchById(85);
        System.out.println("Id: " + im.getId());
        System.out.println("Autor: " + im.getAutor());
        System.out.println("Titol: " + im.getTitol());
        System.out.println("Descripcio: " + im.getDescripcio());
        System.out.println("Data de creacio: " + im.getDataCreacio());
    }
    private static void modifImageFunc(){
        Imatge im = new Imatge();
        im.setTitol("Postes bojes de Sol");
        im.setAutor("Oriol");
        im.setDataCreacio("25-10-2018");
        im.setKeywords("Sol Vermell");
        im.setDescripcio("Es un collage de fotos de postes de sol");
        im.setId(85);
        System.out.println(modifyImatge(im));
    }
    
    private static void listImageFunc(){
       List<Imatge> images; 
       images = listImatges();
       int n = images.size();
       for(int i = 0; i < n; ++ i){
           Imatge im = images.get(i);    
           System.out.println("Id: " + im.getId());
           System.out.println("Autor: " + im.getAutor());
           System.out.println("Titol: " + im.getTitol());
           System.out.println("Descripcio: " + im.getDescripcio());
           System.out.println("Data de creacio: " + im.getDataCreacio());
        }
    }

    private static int registreImatge(org.me.imatge.Imatge imatge) {
        org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
        org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
        return port.registreImatge(imatge);
    }

    private static java.util.List<org.me.imatge.Imatge> listImatges() {
        org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
        org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
        return port.listImatges();
    }

    private static int modifyImatge(org.me.imatge.Imatge imatge) {
        org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
        org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
        return port.modifyImatge(imatge);
    }

    private static Imatge searchById(int id) {
        org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
        org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
        return port.searchById(id);
    }

    private static java.util.List<org.me.imatge.Imatge> searchByTitle(java.lang.String title) {
        org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
        org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
        return port.searchByTitle(title);
    }

    private static java.util.List<org.me.imatge.Imatge> searchByDate(java.lang.String date) {
        org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
        org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
        return port.searchByDate(date);
    }

    private static java.util.List<org.me.imatge.Imatge> searchByAutor(java.lang.String autor) {
        org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
        org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
        return port.searchByAutor(autor);
    }

    private static java.util.List<org.me.imatge.Imatge> searchByKeywords(java.lang.String keywords) {
        org.me.imatge.ImatgeWS_Service service = new org.me.imatge.ImatgeWS_Service();
        org.me.imatge.ImatgeWS port = service.getImatgeWSPort();
        return port.searchByKeywords(keywords);
    }
    
}


