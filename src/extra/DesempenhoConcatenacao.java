package extra;

public class DesempenhoConcatenacao {
    public static void main(String[] args) {
	        int n = 99999;
	        long startTime, endTime;
	        
	        startTime = System.currentTimeMillis();
	        String str = "";
	        for (int i = 0; i < n; i++) {
	            str += "z";
	        }
	        endTime = System.currentTimeMillis();
	        System.out.println("Tempo de concatenação com a classe String: " + (endTime - startTime) + " milisegundos");
	        

	        
	        startTime = System.currentTimeMillis();
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < n; i++) {
	            sb.append("z");
	        }
	        endTime = System.currentTimeMillis();
	        System.out.println("Tempo de concatenação com a classe StringBuffer: " + (endTime - startTime)+ " milisegundos");
    }
}

//Ao rodar em meu computador pessoal, obtive:
//	Tempo de concatenação com a classe String: 607 milisegundos
//	Tempo de concatenação com a classe StringBuffer: 3 milisegundos

//A classe String precisa gerar um novo objeto para cada operação de concatenação, enquanto a classe StringBuffer apenas atualiza o mesmo objeto.