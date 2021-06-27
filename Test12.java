interface A{
  int f();
}

interface B{
  int f();
}

class Test12 implements A, B{   
  public static void main(String... args) throws Exception{   

  }

  @Override
  public int f() {  // from which interface A or B
    return 0;
  }
}   