/** @see http://algs4.cs.princeton.edu/24pq/IndexMinPQ.java.html
  */
package org.gs.queue
import scala.reflect.ClassTag

/** Minimum priority queue with index
  * 
  * @author Scala translation by Gary Struthers from Java by Robert Sedgewick and Kevin Wayne.
  *
  * @constructor creates a new IndexMinPQ with maximum number of elements
  * @tparam A keys are generic and ordered
  * @param nMax maximum number of elements
  */
class IndexMinPQ[A: ClassTag](nMax: Int) extends IndexPriorityQueue[A](nMax) {

  /** Add key to end of array then swim up to ordered position
    *
    * @param i index where key will be inserted if not already there
    * @param key generic element
    * @param cmp greater
    */
  def insert(i: Int, key: A)(implicit ord: Ordering[A]): Unit = { insert(i, key, greater) }

  /** @return index associated with min key */
  def minIndex(): Int = index()

  /** @return min key */
  def minKey(): A = topKey

  /** @return min key and removes it from q */
  def delMin()(implicit ord: Ordering[A]): Int = delTop(greater)

  /** Change key at index to new value, because it can be > or < current, it both swims and sinks
    *
    * @param i index
    * @param key value
    * @param cmp greater
    */
  def changeKey(i: Int, key: A)(implicit ord: Ordering[A]): Unit = { changeKey(i, key, greater) }

  /** Decrease key at index to new value, because it is < current, it both swims
    *
    * @param i index
    * @param key value
    * @param cmp greater
    */
  def decreaseKey(i: Int, key: A)(implicit ord: Ordering[A]): Unit = { decreaseKey(i, key, greater) }

  /** Increase key at index to new value, because it is > current, it sinks
    *
    * @param i index
    * @param key value
    * @param cmp greater
    */
  def increaseKey(i: Int, key: A)(implicit ord: Ordering[A]): Unit = { increaseKey(i, key, greater) }

  /** Remove key at index
    *
    * @param i index
    * @param cmp greater
    */
  def delete(i: Int)(implicit ord: Ordering[A]): Unit = { delete(i, greater) }

  /** check parent in position has left child at k * 2, right child at k * 2 + 1 */
  def isMinHeap()(implicit ord: Ordering[A]): Boolean = checkHeap(greater)

  /** @return keys in order */
  def keys()(implicit ord: Ordering[A]): Seq[A] = getKeys
}
