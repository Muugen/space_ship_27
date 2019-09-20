/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.codingdojo.students;

import fr.rphstudio.codingdojo.game.Pod;
import fr.rphstudio.codingdojo.game.PodPlugIn;

/**
 *
 * @author Romuald GRIGNON
 */
public class Student27 extends PodPlugIn {
    public Student27(Pod p) {
        super(p);
    }

    //-------------------------------------------------------
    // DECLARE YOUR OWN VARIABLES AND FUNCTIONS HERE


    // END OF VARIABLES/FUNCTIONS AREA
    //-------------------------------------------------------
    float checkdis() {
        float Vx = getShipPositionX();
        float Vy = getShipPositionY();
        float Cx = getNextCheckPointX();
        float Cy = getNextCheckPointY();

        float a;
        float b;
        float d;

        a = Vx - Cx;
        b = Vy - Cy;
        d = sqrt(a*a + b*b);
        return d;

    }

    @Override
    public void process(int delta){

        //-------------------------------------------------------
        // WRITE YOUR OWN CODE HERE

        
        setPlayerName("Student 27");
        selectShip(1);
        setPlayerColor(255,255,255,255);


        if(checkdis()<3){
            if (getShipSpeed() <0.8f){
                //cas minimum speed
                turnTowardPosition(getNextCheckPointX(),getNextCheckPointY());
                incSpeed(0.4f);
            }
            else{
                if(getShipSpeed()<1f){
                    //echec drift
                    turnTowardPosition(getNextCheckPointX(),getNextCheckPointY());

                }
                else
                {
                    //drift ok
                    turnTowardPosition(getSecondCheckPointX(),getSecondCheckPointY());
                    incSpeed(-0.5f);
                }
            }

        }else
            {
                turnTowardPosition(getNextCheckPointX(),getNextCheckPointY());
            incSpeed(1f);

        }








        if(getShipBoostLevel()== 100 && checkdis()> 10){
            useBoost();
       }

        if(getShipBatteryLevel(int A<40)





        // END OF CODE AREA
        //-------------------------------------------------------

    }
    
}
