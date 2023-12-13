public class PenangananException {
    public static void main(String[] args) {

        try{
            int a=1;
            int b=2;
            int value = a * b;
            if(value !=3)
            {
                throw new Exception("Jawaban Kurang Tepat");
            }
            System.out.println(("Benar"));
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Selesai");
        }
    }
}
