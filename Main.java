//package oop;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;

public class Main {

String st;
String first = "", last = "";
int s = 0;
String tab;
String name ;
 
Scanner obj = new Scanner(System.in);
 
  void manual(){
    System.out.println("||Guide to use Useless Script||");
    System.out.println();
    System.out.println("# use <man lo> followed by a variable name equals the value you intend to store inside it to declare the variable...");
    System.out.println("for example : $ man lo name = your_name");
    System.out.println();
    System.out.println("# use <agar> followed by some comparison, then use <tab> to print some statement if the comparison results in true");
    System.out.println("for example : $ agar 11>10");
    System.out.println("              $tab jalwa hai humara");
    System.out.println();
    System.out.println("#Fun Commands : ");
    System.out.println("¢ bollywood, munna bhaiya, clear screen, trigonometry, banda bandi, wassup, integration, doglapan.");
    System.out.println();
    System.out.println("Thanks for reading :)");
    System.out.println();
  }
  
  void integration(){
   String I;
    System.out.println("-> Using this code block you can calculate basic standard integrals wrt x");
    System.out.print("∫ ");
    String integral = obj.nextLine ();
    
    switch(integral) {
      
      case "cos x" :
      I = "sin x";
      System.out.println("$ ∫ "+integral+ " dx = " + I );
       break;
       
      case "sin x" :
      I = "-cos x";
      System.out.println("$ ∫ "+integral+ " dx = " + I );
       break;
       
      case "e^x" :
      I = "e^x";
      System.out.println("$ ∫ "+integral+ " dx = " + I );
       break;

    }
  }
  
  void trigo(){
    System.out.println("-> Using this code block you can calculate values of trigonometric functions");
    System.out.println("$ sine = sin, cosine = cos");
    System.out.println("$ tangent = tan, cotangent = cot");
    System.out.println("$ secant = sec, cosecant = csc");
    
    System.out.println("¢ For example : <trigo function> <degrees>");
    System.out.println("¢ For example : sin 45 ");
  }
  
  void trigo1(){
    System.out.print("> ");
    String trigo = obj.nextLine();
    String  trigo_sub = trigo.substring(0, 3);
    double degrees = Double.parseDouble((trigo.substring(3, trigo.length())).trim());
    double radians = Math.toRadians(degrees);
    switch(trigo_sub) {
      case "sin" :
       double sin = Math.sin(radians);
       System.out.println("$ sin("+degrees+")"+" = " + sin);
       break;
      case "cos" :
       double cos = Math.cos(radians);
       System.out.println("$ cos("+degrees+")"+" = " + cos);
       break;
      case "sec" :
       double sec = 1/(Math.cos(radians));
       System.out.println("$ sec("+degrees+")"+" = " + sec); 
       break;
      case "csc" :
       double csc = 1/(Math.sin(radians));
       System.out.println("$ cosec("+degrees+")"+" = " + csc);
       break;
      case "tan" :
       double tan = Math.tan(radians);
       System.out.println("$ tan("+degrees+")"+" = " + tan);
       break;
      case "cot" :
       double cot =1/( Math.tan(radians));
       System.out.println("$ cot("+degrees+ ")" + " = " +cot);
       break;
    }
   
  }
  
  void RandomBollywood() {
    String bolly[] = {"Kitne aadmi the!", "Pushpa, I hate tears…", "Mere paas maa hai.", "Babumoshai, zindagi badi honi chahiye, lambi nahi.", "Rishtey mein toh hum tumhare baap lagte hai, naam hai Shahenshaah!", "Dosti ka ek usool hai madam – no sorry, no thank you.", "Kutte kaminey main tera khoon pee jaunga.", "Mogambo khush hua!", "Haar kar jeetne wale ko baazigar kehte hai.", "Bade bade deshon mein aisi choti-choti baatein hoti rehti hai, Senorita.", "Mere Karan Arjun aayenge.", "Agar maa ka doodh piya hai toh samne aa!",  "Uska to na bad luck hi kharab hai."};
    
    int randomNum = ThreadLocalRandom.current().nextInt(0, bolly.length);
    System.out.println("$ "+ bolly[randomNum]);
    
  }
  
  String init(String s, int a) {
  String get = "";
  for(int i = a+1; i<=s.length()-1; i++){
    get = get + s.charAt(i);
  }
  String get1 = get.trim();
  return get1;
  }

  void condition (String st) {
  int Greater = 0, Lesser = 0;
   int store = st.indexOf("r") + 1;
   String sub1 = (st.substring(store, st.length())).trim();
   
   for(int i = 0; i<=sub1.length()-1; i++){
     if(sub1.charAt(i) == '<'){
      Greater = i;
      break;
      }
     if (sub1.charAt(i) == '>'){
      Lesser = i;
      break;
      }
   }
   
   if(Greater == 0)
    s = s + Lesser;
   if(Lesser == 0)
    s = s + Greater;
   
     for(int b = 0; b<s; b++){
       first = first + sub1.charAt(b);
   
      }
      
      for(int c = s+1; c<=sub1.length() - 1; c++) {
         last = last + sub1.charAt(c);
      }
   if(Greater == 0){
         if(Integer.parseInt(first)>Integer.parseInt(last)){
      
      System.out.println("$ True hai bhay");
      System.out.println("$ " + (tab.substring (4, tab.length()).trim ()));
      System.out.println ();
      }  else {
        
      System.out.println("$ Ye sab doglapan hai bhay");
      System.out.println();
   }
  }
  
  if(Lesser == 0){
     if(Integer.parseInt(first)<Integer.parseInt(last)) {
      
      System.out.println("$ True hai bhay");
      System.out.println("$ " + (tab.substring (4, tab.length()).trim ()));
      System.out.println();
       } else {
      System.out.println("$ Ye sab doglapan hai bhay");
      System.out.println();
   }
  }
 }

  void play(){
   Scanner in = new Scanner (System.in);
   //System.out.println("||Welcome to Useless Script - By Hrishav ||");
   //System.out.println();
   System.out.println("Useless Compiler is running...");
   System.out.print("> ");
   String input = in.nextLine();
 
   String check = input.substring(0, 6);
   
   
   //Initialization
  
   if(check.equals("man lo")) {
   int store = input.indexOf("=");
   System.out.println("# Initialization has been engaged...");
   System.out.println();
   String output1 = init(input, store);
   String variable = "";
   
   for(int i = 6; i<store; i++){
     variable = variable + input.charAt(i);
   }
   variable = variable.trim();
   System.out.println("$ " + variable + " = " + output1);
   System.out.println();
   play();
  }
  
  //If-else construct

  if (input.substring(0, 4).equals("agar")) {
    System.out.println("Agey bata :)");
    System.out.print("> ");
     //in.nextLine();
     tab = in.nextLine();
    if(tab.substring(0,3).equals("tab")) {
     
      condition (input);
      
      play();
  }
  
  }
  
  //Print Code

  if ((input.substring(0, 5)).equals("print")) {
    System.out.println("$ "+(input.substring(5, input.length()).trim()));
    System.out.println();
    play ();
  }
  
  //Bollywood
  if(input.equals("bollywood")) {
    RandomBollywood();
    System.out.println();
    play ();
  }
  
  //Jalwaa
  if(input.equals("munna bhaiya")) {
    System.out.println("$ Jalwa Hai Humara !");
    System.out.println();
    play();
  }
  
  //Clear
  if (input.equals("clear screen")) {
    System.out.println("$ JVM restart kar");
    System.out.println();
    play();
  }
  
  //Manual
  if(input.equals("manual.exe")) {
    manual();
    System.out.println();
    play();
  }
  
  //Doglapan
  if(input.equals("doglapan")) {
    System.out.println("$ Compiler Bechega?");
    System.out.print("> ");
     in.nextLine();
     String yes = in.nextLine();
      if(yes.equals("haa")) {
        System.out.println("$ Ye sab doglapan hai!");
      }
      else {
        System.out.println("$ Bhai kya kar raha hai tu?");
      }
      
      System.out.println();
      
      play();
  }
  
  //Trigonometry
  if(input.equals("trigonometry")){
    trigo();
    System.out.println();
    trigo1();
    play();
  }
  
  if (input.equals("wassup")) {
    System.out.println("$ Hum badhiya hai aap bataiye "+name+" ji");
    System.out.println();
    play();
  }
  
  if(input.equals("banda bandi")) {
    System.out.println("$ Tu kyu type kar hai? tere pass hai kya? XD");
    System.out.println();
    play();
  }
  
  if(input.equals("integration")){
    integration();
    System.out.println();
    play();
  }
  }

  public static void main(String[] args) {
  Main ob = new Main();
  Scanner sc = new Scanner(System.in);

  System.out.println ();
  System.out.println("||Welcome to Useless Script - By Hrishav ||");
  System.out.println();
  
  System.out.println("$ Enter your Name :");
  System.out.print("> ");
  ob.name = sc.nextLine();
  System.out.println("Welcome " + ob.name + "!");
  System.out.println();
  System.out.println("~ Hey " + ob.name + ", would you like a manual? Just type manual.exe");{} 
  System.out.println();
  ob.play();
  }

}
