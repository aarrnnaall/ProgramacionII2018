/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consigna2;
//import java.util.Scanner;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author arnal
 */
public class Fecha {
private int dia ;
private int mes;
private int ano;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
public void input(int _dia,int _mes,int _ano){
setDia(_dia);
setMes(_mes);
setAno(_ano);

}
public void show() {
System.out.println(getDia()+"/"+getMes()+"/"+getAno());     
                   }
public int compararFecha(int dia1,int mes1,int ano1,int dia2,int mes2,int ano2){
if(ano1 == ano2){
if(mes1 < mes2){
return -1;
}
}else if(ano1 < ano2){
return -1;
}
if (ano1 == ano2 && mes1 == mes2){
if(dia1 < dia2) { 
return -1;
}
}else if(ano1 == ano2 && mes1 < mes2){
return -1;
}
if(ano1 == ano2 && mes1 == mes2 && dia1 == dia2){
return -1;
}
if(ano1 == ano2){
if(mes1 > mes2){
return 0;
}
}else if(ano1 > ano2){
return 0;
}
if (ano1 == ano2 && mes1 == mes2){
if(dia1 > dia2) { 
return 0;
}
}else if(ano1 == ano2 && mes1 > mes2){
return 0;
}
return 0;
}
// Suma los días recibidos a la fecha  
 public Date sumarRestarDiasFecha(Date fecha, int dias){
 
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(fecha); // Configuramos la fecha que se recibe
      calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
 
      return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
 
 }

}


