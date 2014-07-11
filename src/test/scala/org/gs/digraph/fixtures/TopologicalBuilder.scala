/** @see http://algs4.cs.princeton.edu/42directed/jobs.txt
  */
package org.gs.digraph.fixtures

import org.gs.digraph.EdgeWeightedDigraph
import org.gs.digraph.DijkstraSP
import org.gs.digraph.DirectedEdge

/** @author Gary Struthers
  * 
*/
trait TopologicalBuilder {
  /*
    Algorithms/Theoretical CS/Databases/Scientific Computing
Introduction to CS/Advanced Programming/Algorithms
Advanced Programming/Scientific Computing
Scientific Computing/Computational Biology
Theoretical CS/Computational Biology/Artificial Intelligence
Linear Algebra/Theoretical CS
Calculus/Linear Algebra
Artificial Intelligence/Neural Networks/Robotics/Machine Learning
Machine Learning/Neural Networks
   */
  val tinyEWDData = Array((4, 5, 0.35), (5, 4, 0.35), (4, 7, 0.37), (5, 7, 0.28), (7, 5, 0.28),
    (5, 1, 0.32), (0, 4, 0.38), (0, 2, 0.26), (7, 3, 0.39), (1, 3, 0.29), (2, 7, 0.34),
    (6, 2, 0.40), (3, 6, 0.52), (6, 0, 0.58), (6, 4, 0.93))
  val size = tinyEWDData.size
  val tinyEdgeArray = {
    for {
      e <- tinyEWDData
    } yield new DirectedEdge(e._1, e._2, e._3)
  }
}
/*
trait TinyEdgeWeightedDigraphBuilder extends TinyEdgeWeightedArrayBuilder {
  val g = new EdgeWeightedDigraph(size)
  for {
    ed <- tinyEdgeArray
  } {
    g.addEdge(ed)
  }
}
trait DijkstraSPBuilder extends TinyEdgeWeightedDigraphBuilder {

  val s0 = 0
  val dsp0 = new DijkstraSP(g, s0)
}*/