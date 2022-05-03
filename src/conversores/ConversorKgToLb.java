/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversores;

/**
 *
 * @author alumno
 */
public class ConversorKgToLb implements IConversor{

    @Override
    public double convertAToB(double a) {
        return a*2.205; 
    
    }

    @Override
    public double convertBToA(double b) {
        return b/2.205;
    }

    @Override
    public String getAname() {
        return "Kilos";
    }
    
    @Override
    public String getASmall() {
        return "Kg";
    }    

    @Override
    public String getBname() {
        return "Libras";
    }

    @Override
    public String getBSmall() {
        return "Lb";
    }


}
