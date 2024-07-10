
// polymorphism is the greek word whose meninig is same object having diffrent behaviour 
// types 
// compile time polymorphism 
// runtime polymorphism 

// A polymorphism which is exist at the time of compailatoin is called compile time or erly bining or static 
// polymorphism 

// Method overloading :
// whenever a class cointain a more then one method with same name and diffrent types of 
// parametter called Meethod overloading 
// class A{
//     void add(){
//         int a=5, b=10, c;
//         c=a+b;
//         System.out.println(c);
//     }
//     void add(int x, int y){
//         int c;
//         c=x+y;
//         System.out.println(c);

//     }
//     void add(int x, double y){
//         double c;
//         c=x+y;
//         System.out.println(c);
//     }
//     public static void main(String[] args) {
//         A r=new A();
//         r.add(); r.add(20,70);  r.add(13,56.9);
//     }
// }

// runtime polymorphism 
// A polymorishum which exicts at the time of excutoin of program is called runtime polymorphism

// Method overriding
// whenever we wrritting a method in super class and sub class in such way that method name and parametter 
// must we same is called mathod overring 

// class lang
// {
//     void speck(){
//         System.out.println("hindi");
//     }
// }
//     class lang2 extends lang
// {
//     @Override
//     void speck(){
//         super.speck();
//         System.out.println("english");
//     }
// }
// class demo{
//     public static void main(String[] args) {
//         lang r= new lang2();
//         r.speck();
//     }
// }

// Encapsultoin 
// encapsulatoin is a machanishum through which can wrapping the data member and member method of class
// in a single unti is called encapsulatopin 
// note:
// declare the class variable as a privet 
// declare method as a public 
// class is best eg is encapsulaatoin 
// class A{
//     private int value;
//     public void setValue(int a){
//         value= a;
//     }
//     public int getValue(){
//         return value;
//     }
// }
// class B{
//     public static void main(String[] args) {
//         A r=new A();
//         r.setValue(100);
//         System.out.println(r.getValue());
//     }
// }

// Abstractoin 
// Abstracrtoin is a prossce of hiding the implementatoin details from user only the highlighting set of 
// sevices provide to the user 
// advantage 
// sequrity 2.enhancement 

// Abstractoin :
// abstract class
// interface 

// Abstract class:
// A class which is contaoin the abstract keyword in its declareatoin is called abstract class
// note:
// it may or may not a contain abstract class
// we cant crearte object for abstract class
// it can have a abstact and non abstract method 
// to use an abstract classs you have to inharit it form sub class
// if a class contain partial implementation then we should declare a class as abstract 
// abstract class animal{
//     public abstract void sound();
// }
// class Dog extends animal{
//     public void sound(){
//         System.out.println("dog is barking");
//     }
// }
// class Lion extends animal{
//     public void sound(){
//         System.out.println("lion is roar");
//     }
// }
// class text{
//     public static void main(String[] args) {
//         Dog r=new Dog();
//         Lion l=new Lion();
//         r.sound();
//         l.sound();
//     }
// }

// Abstract mathod (helf)
// Abstract mathod is contain a abstract modifire at the time of diclrasoin is called abstract mathod 
// note:
// it can be only used in abstract class 
// it dosent contain any body{},and it always ends with ;
// eg.
// abstract class eductatoin{
//     public abstract void teacher();
// }
// class hindi extends eductatoin{
//     @Override
//     public void teacher(){
//         System.out.println("poonam");
//     }

// }
// class english extends eductatoin{
//     @Override
//     public void teacher(){
//         System.out.println("herprit");
//     }
// }
// class board{
//     public static void main(String[] args) {
//         eductatoin h=new hindi();
//         h.teacher();
//         eductatoin e=new english();
//         e.teacher();
//     }
// }

// Interface 
// interface just like a class which contain only abstract mathod 
// note:
// interface method are by defoult public and static 
// interface varible are bydefult public +static+final 
// interface nothing but deals between clintes devloper 

// Excptoin 
// an exceptoin is unexpacted and unwanted abnormal situatoin that occured at runtime called expatoin 
// exceptoin handling 
// in excptoin handling we should have an alternat souce through  which is we can handle the exceptoin 

// the object orented programing machanisum has provide that following techniqe to work with exceptoin 
// 1.try 2.catch  3.finally  4.throw   5.throws 
//eg
// class text{
//     public static void main(String[] args) {
//         System.out.println("main method started");
//         int a=10, b=0, c;
//         try {
//             c=a/b;
//             System.out.println(c);
            
//         } catch(Exception e){
//             System.out.println(e);
//         }
//         System.out.println("main method ended ");
//     }
// }

// Try
// try is block that contain only risky code 
// catch
// it is handle the expetoin 
// finally
// finly block is a realtime block and the  main perpus of finally block to handle the resourese
//eg
// class handling{
//     public static void main(String[] args) {
//          try {
//              int a=20, b=0, c;
//              c=a/b;
//              System.out.println(c);
//              System.out.println("like a girl");
//          } catch (ArithmeticException a) {
//             System.out.println("cant devide by zero");
//          }
//          finally{
//             System.out.println("all done");
//          }
//          System.out.println("main method ");
//     }

// } 

// throw
//throw keyword are used to throw the user defind or cotomised exceptoin object to the jvm explicity for 
// purpose we use throw keyword 
// eg
// class demo{
//     public static void main(String[] args) {
//         throw new Exceptoin ("/by zero");
//     }
// }

// throws 
// throws keyword is used when we dosent want to handle the exceptoin and try to send the excptoin to the jvm
// jvm and outhe method 
// eg
// class throwdemo{
//     public static void main(String[] args)throws InterruptedException {
//         for(int i=1; i<=10; i++){
//             System.out.println(i);
//             Thread.sleep(1000);
//         }
        
//     }
// }

// secound approch 
// class demo{
//     public static void main(String[] args) {
//         for(int i=1; i<=10; i++){
//             try {
//                 System.out.println("i");
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 System.out.println("e");
//             }
//         }
//     }
// }

// its a vary importent a interviwe perspactive 
// final
// final is a keyword and it is a applicabal only for a mathod & classes \
// finally 
// finally is block  it is a always excute weather the excptoin is handle by user or not 
// finalazie
// finalze is mathod it is used deallocks the resouse which is allowcated by used object 

// pakage 
// A pakege arrenge number of class interface and sub-pakage of same type into a particlar gruop 
// note :pakage is nothing but folder in windows
// its a two types 
// 1.pre defined  2.user defind 
// pre defind is java.lang
// java.util
// java.io
// java.applet 
// java.owt 
// java.net

// user defind 
// pakage p1
// pakage add
// pakage my dack

// Access modifire 
// privet 
// defoult 
// public
// protected 
// 

// privte is only for acess in class its not access in outside the class
// defoult only for access in class and pakage
// public its all members accessible outside the class and pakages
// protected its only for dose note acess a outside the pakage 
// ad..
// reusablity 
// security
// fast searching 
// numing conflechching 
// hiding 
// dis..
// we cant pass to parametter to pakaage


 