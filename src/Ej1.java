public class Ej1 {
    private int[] wall = new int[] {3,4,2,4,2}; //array con los datos a igualar
    public static void main(String[] args) {
        Ej1 ej1 = new Ej1(); //para no tener que poner los metodos statico

        int blockAmount = ej1.blocksAmount();//Obtenemos la suma de todos los elementos del array
        System.out.println(blockAmount);
        int avg = ej1.getAvg(blockAmount);//Obtenemos el Promedio de los elementos
        System.out.println(avg);
        System.out.println(ej1.wallSize(avg));//Obtenemos los bloques a mover en ese array
    }

    public int blocksAmount() {
        int blockAmount = 0;
        for (int i = 0; i < wall.length; i++){
            blockAmount += wall[i];
        }
        return blockAmount;
    }

    public int getAvg(int blockAmount) {
        return blockAmount / wall.length;
    }

    public int wallSize(int blockAvg) {
        int blocksToMove = 0;
        for (int i = 0 ; i < wall.length; i++) {
            if (wall[i] > blockAvg) {
                blocksToMove = blocksToMove + (wall[i] - blockAvg);
            }
        }
        return blocksToMove;
    }
}
