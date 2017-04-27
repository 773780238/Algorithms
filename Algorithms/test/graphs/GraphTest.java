package graphs;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;

public class GraphTest {
	
	@Test
	public void testGraph() throws FileNotFoundException{
		
		Graph testGraph = new Graph("graph_input.txt");
		assertEquals("[12, 10, 11]", testGraph.getNodesAdjacentTo(9).toString());
		assertEquals("[0, 4, 3]", testGraph.getNodesAdjacentTo(5).toString());
		assertEquals("[4, 0]", testGraph.getNodesAdjacentTo(6).toString());
		assertEquals("[8]", testGraph.getNodesAdjacentTo(7).toString());
		assertEquals("[7]", testGraph.getNodesAdjacentTo(8).toString());
		assertEquals("[9]", testGraph.getNodesAdjacentTo(10).toString());
		assertEquals("[5, 1, 2, 6]", testGraph.getNodesAdjacentTo(0).toString());
		
	}
	
	
	
	

}