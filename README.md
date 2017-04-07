# Sort
Java 简单排序算法

### 一、简单排序
#### 1. [冒泡排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/BubbleSort.java)
&emsp;思想：通过与相邻元素的比较和交换来把小的数交换到最前面。时间复杂度为O(n^2)
#### 2. [选择排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/SelectSort.java)
&emsp;思想：选择整体比较来确定最小的数并与选择的数交换。

&emsp;算是冒泡排序的优化，在确定最小数的时候交换，减少了交换次数(赋值的次数)
#### 3. [插入排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/InsertSort.java)
&emsp;思想：通过比较找到合适的位置插入元素来达到排序的目的的。

&emsp;先选择前两位比较，排序，在增加一个数，对前一轮排好序的数组进行插入

### 二、高效排序
#### 1. [快速排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/QuickSort.java)
&emsp;思想：冒泡排序的优化，比较和交换小数和大数，把小数排到上面，大数排到下面。

&emsp;不稳定的排序，时间复杂度为O(nlgn)

#### 2. [堆排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/HeapSort.java)
&emsp;思想：借助堆来实现的选择排序，升序使用大顶堆，降序使用小顶堆。

#### 3. [希尔排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/ShellSort.java)
&emsp;是插入排序的一种高效率的实现，也叫缩小增量排序。

&emsp;思想：先将整个待排记录序列分割成为若干个子序列分别进行插入排序，待整个序列中的记录基本有序时再对全体记录进行一次插入排序。

&emsp;子序列的构成不是简单的逐段分割，而是将某个相隔某个增量的记录组成一个子序列。

### 三、递归排序

#### 1. [归并排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/MergeSort.java)
&emsp;是另一种不同的排序方法，是用来递归分治的思想。

&emsp;思想：先递归划分子序列，然后合并结果。把待排序序列看成由2个有序的子序列，然后合并两个子序列，再把子序列看成由两个有序序列

&emsp;空间复杂度为O(n)，时间复杂度为O(nlogn)

### 四、现行排序

#### 1. [计数排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/CountSort.java)
&emsp;待排序数满足一定条件的时候时间复杂度可以达到O(n)

&emsp;思想：用待排序的数作为计数数组的下标，统计每个数字的个数，然后依次输出得到有序序列。

#### 2. [桶排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/BucketSort.java)
&emsp;是计数排序的一种改进

&emsp;思想：假设有一组长度为N的待排关键字序列K[1....n]。首先将这个序列划分成M个的子区间(桶) 。然后基于某种映射函数f ，将待排序列的关键字k映射到第i个桶中(即桶数组B的下标 i) ，那么该关键字k就作为B[i]中的元素(每个桶B[i]都是一组大小为N/M的序列)。接着对每个桶B[i]中的所有元素进行比较排序(可以使用快排)。然后依次枚举输出B[0]....B[M]中的全部内容即是一个有序序列。bindex=f(key)   其中，bindex 为桶数组B的下标(即第bindex个桶), k为待排序列的关键字。桶排序之所以能够高效，其关键在于这个映射函数，它必须做到：如果关键字k1<k2，那么f(k1)<=f(k2)。也就是说B(i)中的最小数据都要大于B(i-1)中最大数据。很显然，映射函数的确定与数据本身的特点有很大的关系。

#### 3. [基数排序](https://github.com/Alamusitl/Sort/tree/master/Sort/src/main/java/com/owl/RadixSort.java)
&emsp;基数排序是通过多次的收分配和收集来实现的，关键字优先级低的先进行分配和收集。

### 各个算法的比较
![各个算法的比较](https://github.com/Alamusitl/Sort/tree/master/img/compare.png)