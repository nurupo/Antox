package im.tox.antox.wrapper

import java.util
import java.util.Collections

//remove if not needed
import scala.collection.JavaConversions._

class PeerList {

  private var peers: util.List[GroupPeer] = new util.ArrayList[GroupPeer]()

  def this(peers: util.ArrayList[GroupPeer]) {
    this()
    this.peers = peers
  }

  def getPeer(peerNumber: Int): GroupPeer = {
    peers.get(peerNumber)
  }

  def all(): util.List[GroupPeer] = {
    new util.ArrayList[GroupPeer](this.peers)
  }

  def addGroupPeer(peer: GroupPeer): Unit = {
    this.peers.add(peer)
  }

  def removeGroupPeer(peerNumber: Int) {
    peers.remove(peerNumber)
  }

  def clear(): Unit = {
    peers.clear()
  }
}
