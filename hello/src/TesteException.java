public class TesteException {
    public static void main(String[] args) throws DivisaoPorZeroException {
        try {
            int val = 10/0;
            System.out.println(val);
        } catch (Exception e) {
            throw new DivisaoPorZeroException();
        }
    }
}
