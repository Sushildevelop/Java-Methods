package Practice.Methods;


        // Methods in Java
  /*      1. Methods is a block of code / collection of statements/
                a set of code , grouped toghter to perform a certain task or operation.
               -> A method runs only when it's called.
               -> Methods are also known as functions.

   */

//         Why are Methods Important in Java
   /*   1.    methods allow and enable us to write code once and use it as many time.
        2.   methods are often called time savers because they help you to reuse the existing code
             hence saving a lot of your time in re-typing at multiple places.

    */

    /*    method like a function is a collection of instructions that perform a task,
        but a method is associated with object but function is not.

     */
        /*   User-defined Methods : methods create based on the requirements.
             Standard library Methods: built-in methods in java

         */

   /*     How to declare Methods
                acess specifier     return type   method name   parameter list
                public                int           sum          (int a , int b)


    */
     /*   1. Acess specifier : -> It is the access type of the method.
                               -> It specifies the visiblity and accessibility of the method.
                       there are four type of access specifiers
                  1.     Private -> methods and data members declared as private are accessible only within the class.

                  2.    Public -> the methods that are declared public are accessible from everywhere in the program
                         there is no restriction on the scope of public data members.

                   3.   Protected -> methods accessible within the same packages or subclassess n different packages.

                   4.   Default->     No access modifier and accessible only within the same packages.
      */
        /*
           3. return type:  it is used to specify the data type of the value returned from a method.
           4.  Method   Name
           5.   Parameters

         */

//  The keyWord static means that the particular method/attribute can be accessed
// without creating an object of a class.

    class Methods_intro {

        public int add(int x , int y){
            int addition=x+y;
            return addition;
        }
//       static void welcome(){
//           System.out.println("Welcome to New Duniya");
//       }
       public static void main(String[] args) {

//          welcome();

           int x=10;
           int y=60;
           Methods_intro obj=new Methods_intro();
           int ans=obj.add(x,y);
           System.out.println("sum is: "+ans);

           System.out.println("Square root of 16 is : "+Math.sqrt(16));
           System.out.println("Square root of 16 is : "+Math.floor(16.7));



    }
}
