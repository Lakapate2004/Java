/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_analyzer;

/**
 *
 * @author Hero
 */
public class Text_analyzer {

    /**
     * @param args the command line arguments
     */
    
    
    private String inputtext ;
    private int length ;
    private int words ;
    private int textlength;
    private int line;
    private int tabs;
    private int space;
    private String uniquechartext;

    Text_analyzer(String inputtext) {
        this.inputtext = inputtext;
        analyze();
    }

    public String getInputtext() {
        return inputtext;
    }

   
    public int getWords() {
        return words;
    }

    public int getTextlength() {
        return textlength;
    }

    public int getLine() {
        return line;
    }

    public int getTabs() {
        return tabs;
    }

    public int getSpace() {
        return space;
    }

    public String getUniquechartext() {
        return uniquechartext;
    }
    
    int getcharorwordcount(String text){
        return 0 ;
    }
    
    public String getwordcount(String word){
        int count = 0 ;
        String[] wordarray = inputtext.split("[,.\t\n ]");
        for (int i = 0; i < wordarray.length; i++) {
        if (word.equals(wordarray[i])) {
            count++;
        }
    }
        return Integer.toString(count);
    }
    public String getcharcount(String charcter){
    int count =  0;
    for(int i = 0;i<inputtext.length();i++){
       if(charcter.charAt(0) == inputtext.charAt(i)){
        count++;
    }
    }
    return Integer.toString(count);
}
     public String toString() {
        return "TextAnalyzer{" + "length=" + textlength + ", words=" + words + ", spaces=" + space + ", lines=" + line + ", tabs=" + tabs + '}';
    }

    
    private void analyze(){
        textlength = inputtext.length();
        line = inputtext.split("\n",-1).length;
        space = inputtext.split(" ",-1).length;
        tabs = inputtext.split("\t",-1).length;
        words = inputtext.split("[\n\t ]").length;

        
    }
    
    public static void main(String[] args) {
        Text_analyzer textsample = new Text_analyzer("fsdz  @/n/t");
        System.out.println(textsample);
        // TODO code application logic here
    }
    
}
