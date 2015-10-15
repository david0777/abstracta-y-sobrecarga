
package creens;

public class cliss {
  
    String k[]= new String[28];
    int nu[] = new int [28];
    {
        


 k[0] = "las sagradas escrituras 1";
 k[1] = "la trinidad 2";
 k[2] = "Dios padre 3";
 k[3] = "Dios hijo 4";
 k[4] = "Dios espiruto santo 5";
 k[5] = "la creación 6";
 k[6] = "la naturaleza del hombre 7";
 k[7] = "el gran conflicto 8";
 k[8] = "la vida, muerte y resurrecion de cristo 9";
 k[9] = "la esperencia de salvación 10";
 k[10] = "el crecimiento en cristo 11";
 k[11] = "la iglesia 12";
 k[12] = "el remanente y su misión 13";
 k[13] = "la unidad en el cuerpo de cristo 14";
 k[14] = "el bautismo 15";
 k[15] = "la sena del señor 16";
 k[16] = "los dones y ministerios espirituales 17";
 k[17] = "el don de profecia 18";
 k[18] = "la ley de Dios 19";
 k[19] = "el sabado 20";
 k[20] = "la mayordomia 21";
 k[21] = "conducta cristiana 22";
 k[22] = "el matrimonio y la familia 23";
 k[23] = "el ministrio de cristo en el santuario celestial 24";
 k[24] = "la segunda venidad de cristo 25";
 k[25] = "muerte y resurreción 26";
 k[26] = "el ministerio y el fin del pecado 27";
 k[27] = "la nueva tierra 28";
 
    }

{
nu[0]= 1 ;
nu[1]= 2 ;
nu[2]= 3 ;
nu[3]= 4 ;
nu[4]= 5 ;
nu[5]= 6 ;
nu[6]= 7 ;
nu[7]= 8 ;
nu[8]= 9 ;
nu[9]= 10 ;
nu[10]= 11 ;
nu[11]= 12 ;
nu[12]= 13 ;
nu[13]= 14 ;
nu[14]= 15 ;
nu[15]= 16 ;
nu[16]= 17 ;
nu[17]= 18 ;
nu[18]= 19 ;
nu[19]= 20 ;
nu[20]= 21 ;
nu[21]= 22 ;
nu[22]= 23 ;
nu[23]= 24 ;
nu[24]= 25 ;
nu[25]= 26 ;
nu[26]= 27 ;
nu[27]= 28 ;
}
  public String ordenar(int i){
        for (int j = 0; j < 27; j++) {
            for (int a = i+1; a < 27; a++) {
                 if (nu [j] > nu[a]) {
                     String temp; 
                     temp = k[j]; 
                     k[j] = k[a];
                     k[a] = temp;
                     
                     int tem;
                     tem = nu[j];
                     nu[j] = nu[a];
                     nu[a] = tem;
                }
            }
        }
     return k[i];   
    }
     public String desordenar(int i){
        for (int j = 0; j < 27; j++) {
            for (int a = 1; a < 28; a++) {
                int x;
                x = nu[a];
                 if (nu [j] > x) {
                     String temp; 
                     temp = k[j]; 
                     k[j] = k[a];
                     k[a] = temp;
                     
                     int tem;
                     tem = nu[j];
                     nu[j] = nu[a];
                     nu[a] = tem;
                }
            }
        }
     return k[i];   
    }
}


