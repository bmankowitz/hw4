class OtherErrors{
    public static void main(String[] a){
        System.out.println(new Fac().OEx(10));
    }
}

class OE {
    public int TFE(){
        return 3;
    }
    public int OEx(int num) {
        int x;
        Extra e;
        int[] arr;
        boolean z;
        e = new extra();
        x = e.extra(); //TE

        x = Extra.extra() ;
        x = num * (this.OEx(num-1));
        arr = new int[3];
        x = arr[3];
        arr[3] = 2;
        x = 3 + (5 + (3 + 3 ));
        return 3;
    }
    public boolean OEb(){
        int x;
        x = this.OEx(2);
        return true;
    }
}

class Extra {
    int eint;
    public int extra(){
        return 0;
    }
}
