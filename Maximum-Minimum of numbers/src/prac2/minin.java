package prac2;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class minin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ANTLRInputStream inp=new ANTLRInputStream("7,1,14+");
		maxminLexer lexer=new maxminLexer(inp);
		CommonTokenStream tokens=new CommonTokenStream(lexer);
		maxminParser parser =new maxminParser(tokens);
		System.out.println(parser.s());
	}

}
