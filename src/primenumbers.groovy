class primenumbers {
    static void main(String[] args) {
        println("Write a number and we will determine if it is a Prime number or not")
        int usrnpt
        usrnpt = Integer.parseInt(System.in.newReader().readLine())
        println isPrimeNum_v2(usrnpt);

    }

    static boolean isPrimeNum(int prim){
        def i =2;

        while (i< prim){
            if(prim%i == 0){
                return false;
            }
            i++
        }
        return true
    }

    static boolean isPrimeNum_v2(int prim){
        for(def i = 2; i < prim; i++){
            if(prim%i==0)
                return false
        }
        return true
    }
}