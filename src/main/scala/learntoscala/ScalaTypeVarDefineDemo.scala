package learntoscala

/**
 * Created by arachis on 2016/12/23.
 *
 * ����ѧscala�� 17.3�� ���ͱ����綨ʾ��
 */
object ScalaTypeVarDefineDemo {

  /*  * ����������Ϊ����֪��first�Ƿ���compareTo��������Ҫ���һ���Ͻ� T<:Comparable[T],����ζ��T������Comparable[T]��������
    class Pair(val first:T,val second:T){
      def smaller = if (first.compareTo(second) < 0) first else second
    }*/

  //ͨ������޶���
  class Pair[T <: Comparable[T]](val first: T, val second: T) {
    def smaller = if (first.compareTo(second) < 0) first else second
  }

  val p = new Pair("Fred", "Brooks")
  println(p.smaller)


  /**
   * Ҳ����Ϊ����ָ��һ���½硣�����������ٶ�������Ҫ����һ������������һ��ֵ�滻��ż�ĵ�һ�����
   */
  class Pair[T <: Comparable[T]](val first: T, val second: T) {
    //def repalceFirst(newFirst:T) = new Pair[T](newFirst,second)
    //�ٶ�������һ��Pair[Student],����Ӧ��������һ��Person���滻��һ��������滻���������ͱ�����ԭ���͵ĳ�����
    def repalceFirst[R >: T](newFirst: R) = new Pair[R](newFirst, second)
  }


}



























