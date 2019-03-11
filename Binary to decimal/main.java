import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRStringStream;

public class mami {
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			InputStream is=System.in;
			is=new FileInputStream("C:\\Users\\PAVEETHRAN\\eclipse-workspace\\P2-2\\src\\input");
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String expr=br.readLine();
			while(expr!=null)
			{
			ANTLRInputStream inp=new ANTLRInputStream(expr);		
			bindecLexer lexer=new bindecLexer(inp);
			CommonTokenStream tokens=new CommonTokenStream(lexer);
			bindecParser parser=new bindecParser(tokens);
			System.out.println(parser.equation());
			expr=br.readLine();
			}
		}
}

