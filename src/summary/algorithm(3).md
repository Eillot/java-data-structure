算法效率的度量方法
1、事后统计方法
   事后统计方法：这种方法主要是通过设计好的测试程序和数据，利用计算机时器对不同算法编制的程序的运行时间做出比较，从而确定算法效率的高低。

   这种方法等程序编好后才能测试，测试的环境等因素，通常情况下这种方法是不可取的的。

2、事前分析估算方法
  事前分析估计方法：在计算机程序编制前，依据统计方法对算法进行估量。

 经过分析，我们发现，一个高级程序语言编写的程序在计算机上运行时所消耗的时间取决于下列因素：

1） 算法采用的策略、方法

2）编译产生的代码质量

3）问题的输入规模

4）机器执行指令的速度

第1条当然是算法好坏的根本，第2条由软件支持，第4条要看硬件性能。也就是说抛开这些与计算机硬件、软件有关的因素，一个程序的运行时间，依赖于算法的好坏和问题的输入规模。所谓问题输入规模就是指输入量的多少。

最终，在分析程序运行的时间时，最重要的是把程序看出是独立于程序设计语言的算法或者一系列步骤。

 

函数的渐进增长
函数的渐进增长：给定两个函数f(n)和g(n),如果存在一个整数N,使得对于所有的n>N，f(n)总是比g(n)大，那么，我们说f(n)的增长渐近快于g(n)。

由例子，我们可以得出结论，判断一个算法的效率时，函数中的常数和其次项常常可以忽略，而更应该关注主项，即最高阶项。

 

算法时间复杂度
算法时间复杂度定义：在进行算法分析时，语句总的执行次数T(n)是关于问题规模n的函数，进而分析T(n)随n的变化情况并确定T(n)的数量级。算法的时间复杂度，也就是算法的时间量度，记作：T(n)=O(f(n))。它表示随问题规模n的增大，算法执行时间的增长率和f(n)增长率相同，称作算法的渐近时间复杂度，简称为时间复杂度。其中f(n)是问题n的某个函数。

这样用O()来体现算法时间复杂度的记法，称之为大O记法。

一般情况下，随着n增大，T(n)增长最慢的算法为最优算法。O(1)叫常数阶，O(n)叫线性阶，O(n2)叫做平方阶。

推导大O阶方法
推导大O阶：

1、用常数1取代运行时间中的所有加法常数。

2、在修改后的运行次数函数中，只保留最高阶项。

3、如果最高价项存在且不是1，则去除与这个项相乘的常数，得到的结果就是大O阶。

 

常见的时间复杂度
常用的时间复杂度所耗费的时间从小到大依次是：

O(1)<O(logn)<O(n)<O(nlogn)<O(n2)<O(n3)<O(2n)<O(n!)<O(nn)

 

最坏情况与平均情况
最坏情况运行时间是一种保证，那就是运行时间将不会再坏了。在应用中，这是一种最重要的需求，通常，除非特别指定，我们提到的运行时间都是最坏情况的运行时间。

平均运行时间是所有情况中最有意义的，因为它是期望的运行时间。

 
算法空间复杂度
算法的空间复杂度通过计算算法所需的存储空间实现，算法空间复杂度的计算公式记作：S(n)=O(f(n))，其中，n为问题的规模，f(n)为语句关于n所占存储空间的函数。

通常，我们都使用“时间复杂度”来指运行时间的需求，使用“空间复杂度”指空间需求。当不用限定词地使用“复杂度”时，通常都是指时间复杂度。