class Analogy{

    public Analogy(){
        sumOfRange(1, 10);  
    }
    public static void main(String[] arg){
        Analogy analogy = new Analogy();
        //analogy.sumOfRange(1, 10);
    }
    public void sumOfRange(int start, int end){
        int sum = 0;
        for(int num = start; num <= end; num++){
            sum += num;
        }
        System.out.println(sum);
    }//method ends here
}//class ends here