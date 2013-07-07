package com.tinkerpop.gremlin.scala

import java.util.{ Map ⇒ JMap }
import com.tinkerpop.blueprints.{ Vertex, Edge }

//TODO: use methods on scalapipeline directly to avoid casts
class ScalaVertex(val vertex: Vertex) extends ScalaElement(vertex) {
  /** follow all outgoing edges to the vertices */
  def out(): GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).out().asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow outgoing edges to the vertices, limited by given branch factor */
  def out(branchFactor: Int): GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).out(branchFactor).asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow outgoing edges with given labels to the vertices */
  def out(labels: String*): GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).out(labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow outgoing edges with given labels to the vertices, limited by given branch factor */
  def out(branchFactor: Int, labels: String*): GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).out(branchFactor, labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow all outgoing edges */
  def outE: GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).outE().asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow all outgoing edges, limited by given branch factor */
  def outE(branchFactor: Int): GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).outE(branchFactor).asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow outgoing edges with given labels */
  def outE(labels: String*): GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).outE(labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow outgoing edges with given labels, limited by given branch factor  */
  def outE(branchFactor: Int, labels: String*): GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).outE(branchFactor, labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow all incoming edges to the vertices */
  def in: GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).in().asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow all incoming edges to the vertices, limited by given branch factor */
  def in(branchFactor: Int): GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).in(branchFactor).asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow incoming edges with given labels to the vertices*/
  def in(labels: String*): GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).in(labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow incoming edges with given labels to the vertices, limited by given branch factor */
  def in(branchFactor: Int, labels: String*): GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).in(branchFactor, labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow incoming edges */
  def inE: GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).inE().asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow incoming edges, limited by given branch factor */
  def inE(branchFactor: Int): GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).inE(branchFactor).asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow incoming edges by labels */
  def inE(labels: String*): GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).inE(labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow incoming edges by labels, limited by given branch factor */
  def inE(branchFactor: Int, labels: String*): GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).inE(branchFactor, labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow all incoming and outgoing edges to the vertices */
  def both: GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).both().asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow incoming and outgoing edges to the vertices */
  def both(labels: String*): GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).both(labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow incoming and outgoing edges to the vertices */
  def both(branchFactor: Int, labels: String*): GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).both(branchFactor, labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]]

  /** follow incoming and outgoing edges */
  def bothE: GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).bothE().asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow incoming and outgoing edges, limited by given branch factor */
  def bothE(branchFactor: Int): GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).bothE(branchFactor).asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow incoming and outgoing edges */
  def bothE(labels: String*): GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).bothE(labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  /** follow incoming and outgoing edges, limited by given branch factor */
  def bothE(branchFactor: Int, labels: String*): GremlinScalaPipeline[Vertex, Edge] =
    new GremlinScalaPipeline[Vertex, Edge].start(vertex).bothE(branchFactor, labels: _*).asInstanceOf[GremlinScalaPipeline[Vertex, Edge]]

  def -> : GremlinScalaPipeline[Vertex, Vertex] =
    new GremlinScalaPipeline[Vertex, Vertex].start(vertex).asInstanceOf[GremlinScalaPipeline[Vertex, Vertex]];
}

/**Implicit conversions between [[com.tinkerpop.blueprints.Vertex]] and [[com.tinkerpop.gremlin.scala.ScalaVertex]]. */
object ScalaVertex {
  def apply(vertex: Vertex) = wrap(vertex)
  implicit def wrap(vertex: Vertex) = new ScalaVertex(vertex)
  implicit def unwrap(wrapper: ScalaVertex) = wrapper.vertex
}
