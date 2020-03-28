/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uncalculated1.Logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import uncalculated.Model.ModelProgram;

/**
 *
 * @author denan
 */

    public class Logic extends ModelProgram{
    
    ModelProgram mp = new ModelProgram();
    
    public String result(String name, String nisn, String majors, String sl, 
            String indonesian, String english, String math, String tfsl, String average){
        String noun = mp.returnMajors(majors);
        String sl_status = mp.returnSL(sl);
        
        return "Your name is " + name + "\nYour nisn is " + nisn + ".\nYour "
                + "majors is " + noun + "\nYour selected lesson is " + sl + 
                "\nYour indonesian score is " + indonesian + "\nYour english "
                + "score is " + english + "\nYour math score is " + math + 
                "\nYour selected lesson score is " + tfsl + "\nThe average for "
                + "your score is " + average;
    }
    
    public String result (String name){
        return "The name is " + name + ".";
    }
    
    public String result(String name, String sl){
        String sl_status = mp.returnSL(sl);
        
        return "The name is " + name + "\nand your selected lesson is " + sl;
    }
       
    public Boolean checkName(String name){
        Pattern pattern = Pattern.compile("^[a-z\\s*A-Z_]*$");
        
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    
    public Boolean checkNISN(String nisn){
        Pattern pattern = Pattern.compile("^[0-9_]*$");
        
        Matcher matcher = pattern.matcher(nisn);{
        return matcher.matches();
    }   
    }
}
