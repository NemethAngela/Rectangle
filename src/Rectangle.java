/*
* File: app.js
* Author: Németh Angéla
* Copyright: 2023, Németh Angéla
* Group: Szoft 2-1 E
* Date: 2023-11-22
* Github: https://github.com/NemethAngela/
* Licenc: GNU GPL
*/

public class Rectangle implements IResizable {
    
    int width;
    int height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }


}
