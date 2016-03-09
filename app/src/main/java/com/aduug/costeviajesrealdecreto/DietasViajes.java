package com.aduug.costeviajesrealdecreto;


import java.text.DecimalFormat;

public class DietasViajes {

    private double aloj;
    private double manu;
    private int dias;
    private int pers;

    DecimalFormat df = new DecimalFormat("#.##");

    public DietasViajes (double aloj,double manu,int dias, int pers){
        this.aloj=aloj;
        this.manu=manu;
        this.dias=dias;
        this.pers=pers;

    }
    public double calculaCoste(){

        double costeTotal = 0;

//        this.aloj=aloj*pers;
//        this.manu=manu*pers;

        costeTotal=calculaCosteAloj()+ calculaCosteManu();

        return costeTotal;

    }

    public double calculaCosteAloj(){

        if (dias==0){
            return 0;
        }else{
            double costeAloj = 0;

            costeAloj=(aloj*pers)*dias;

            return costeAloj;
        }
    }

    public double calculaCosteManu(){

        double costeManu = 0;

        costeManu=(manu*pers)*(dias+1);

        return costeManu;

    }

}
