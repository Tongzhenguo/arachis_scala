package org.apache.spark

import org.apache.spark.rdd.RDD

/**
 * Created by arachis on 2016/11/22.
 * :��Ϊsc.checkpointFile(path)��private[spark]�ģ����Ը���Ҫд���Լ��������½���package org.apache.spark��
 */
object RDDUtils extends SparkContext with Serializable{
  def getCheckpointRDD[T](sc:SparkContext, path:String) = {
    //pathҪ��part-000000�ĸ�Ŀ¼
    val result : RDD[Any] = sc.checkpointFile(path)
    result.asInstanceOf[T]
  }

}
