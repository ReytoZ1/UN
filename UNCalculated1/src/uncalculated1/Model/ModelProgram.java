/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uncalculated1.Model;

/**
 *
 * @author denan
 */
public class ModelProgram {
    public String label = "Please input your information to get the result";
    
    public String returnMajors(String majors){
        String noun = "Science";
        
        if(majors.toLowerCase().equals("social")){
            noun = "Social";
        }
        return noun;
    }
    
    public String returnSL(String sl){
        switch(sl){
            case "Physics":
                return"Physics";
                    
            case "Biology":
                return"Biology";
                
            case "Chemistry":
                return"Chemistry";
                
            case "Sociology":
                return "Sociology";
                
            case "Geography":
                return "Geography";
                
            case "Economy":
                return "Economy";
                
            default:
                return " is Empty";
                
        }
    } 
}
