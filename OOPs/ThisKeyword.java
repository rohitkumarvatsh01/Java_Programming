class ThisKeyword{
    int a;
    ThisKeyword(int a){
        this.a=a;
    }

    void show(){
        System.out.println("This Keyword:- "+a);
    }

    
        public static void main(String[] args) {
            ThisKeyword obj=new ThisKeyword(100);
            obj.show();
        }
   
}



