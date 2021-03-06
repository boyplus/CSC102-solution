package sample;

public class Student {
    private int id,score;
    private String name;
    private char gender;
    Student(int id,String name,char gender,int score){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setScore(int score){
        this.score = score;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }
    public int getScore(){
        return this.score;
    }

    public char calGPA(){
        if(this.score >= 80) return 'A';
        else if(this.score >= 70) return 'B';
        else if(this.score >= 60) return 'C';
        else if(this.score >= 50) return 'D';
        else return 'F';
    }

}
