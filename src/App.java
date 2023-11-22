/*
* File: app.js
* Author: Németh Angéla
* Copyright: 2023, Németh Angéla
* Group: Szoft 2-1 E
* Date: 2023-11-22
* Github: https://github.com/NemethAngela/
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Szélesség: " + rectangle.width + ", Hossz: "+ rectangle.height );

        rectangle.resize(50, 80);
        System.out.println("Szélesség: " + rectangle.width + ", Hossz: "+ rectangle.height );
    }
}
