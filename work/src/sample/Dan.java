package sample;
import java.util.ArrayList;

public class Dan {
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> vid = new ArrayList<String>();
    private ArrayList<String> tel = new ArrayList<String>();
    private ArrayList<String> adres = new ArrayList<String>();
    private ArrayList[] all = new ArrayList[]{name, vid, tel, adres};//Массив в котором данные работодателя
    private ArrayList<String> last_name = new ArrayList<String>();
    private ArrayList<String> name1 = new ArrayList<String>();
    private ArrayList<String> middle_name = new ArrayList<String>();
    private ArrayList<String> qualification = new ArrayList<String>();
    private ArrayList<String> profession = new ArrayList<String>();
    private ArrayList<String> about_me = new ArrayList<String>();
    private ArrayList[] all1 = new ArrayList[]{last_name, name1, middle_name, qualification, profession, about_me};

    public String arr() {
        String st="Ничего нету";
        System.out.println(all[4].size());
        for(int i=0;i<all.length;i++){
            for(int j=0;j<all[i].size();j++){
                System.out.println(all[i].get(j));
            }
        }
        for(int i=0;i<all1.length;i++){
        for(int j=0;j<all1[i].size();j++){
               System.out.println(all1[i].get(j));
            }
        }
        return st;
    }
    public String klient(){
        String st="Ничего нету";
        for(int i=0;i<all[4].size()-1;i++){
            System.out.println("Начало");
            System.out.println(all[4].get(i));
            System.out.println(all1[4].get(all1[4].size()-1));
            System.out.println("Конец");
            if(all[4].get(i)==all1[4].get(all1[4].size()-1)){
                st="Название компании: "+all[0].get(i);
                st+="\n"+"Вид деятельности: "+all[1].get(i);
                st+="\n"+"Телефон: "+all[2].get(i);
                st+="\n"+"Адрес: "+all[3].get(i);
                st+="\n"+"Требуемая професия"+all[3].get(i);
            }
        }
        return st;
    }

    public void setName(String st){ all[0].add(st); }
    public void setVid(String st){ all[1].add(st); }
    public void setTel(String st){ all[2].add(st); }
    public void setAdres(String st){ all[3].add(st); }
    public void setLast_name(String st){ all1[0].add(st); }
    public void setName1(String st){ all1[1].add(st); }
    public void setMiddle_name(String st){ all1[2].add(st); }
    public void setQualification(String st){ all1[3].add(st); }
    public void setProfession(String st){ all1[4].add(st); }
    public void setAbout_me(String st){ all1[5].add(st); }
}