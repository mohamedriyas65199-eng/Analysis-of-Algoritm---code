public class Main{
    public static void main(String[] args){
        int[][] graph={
            {0,1,1},
            {1,0,1},
            {1,1,0}
        };
        if(isHamiltonian(graph)){
            System.out.println("Hamiltonian Circuit exixts");
        }else{
            System.out.println("Hamiltonian Circuit doesn't exists");
        }
    }
    static boolean isHamiltonian(int[][] graph){
        if(graph[0][1]==1 && graph[1][2]==1 && graph[2][0]==1){
            return true;
        }
        return false;
    }
}