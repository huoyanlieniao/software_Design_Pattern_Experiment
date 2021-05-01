# software_Design_Pattern_Experiment
软件设计模式实验_java

[toc]

### 声明：所有的操作都是简单的一句话，是用来练习软件设计模式的。

-------







### 一、命令模式

#### 1.题目

使用命令模式设计一简单文本编辑器的界面。要求提供一个主菜单，主菜单中包含“文件”和“编辑”两个菜单项，菜单项的主要方法是click（），每个菜单项包含一个抽象命令类，具体命令类包括OpenCommand(打开命令)，CreateCommand(新建命令)，CopyCommand(拷贝命令)，PasteCommand（粘贴命令）等，命令类具有一个execute()方法，用于调用界面类(BoardScreen)的open()、create()、copy()、paste()等方法,这些方法的具体内容可以是简单的“System.out.println("xxx方法被调用");”。选做内容：增加日志功能（将所有操作记录到一个文件中）和撤销操作（Undo）

 

#### 2.分析

- 命令模式包含四种角色：命令接口、具体命令、请求者、接收者

- 根据命令模式的四种角色分析认为：
  - 命令接口：Command
  - 具体命令：Copycommand、OpenCommand、CreateCommand、PasteCommand、Undo
  - 请求者：Text、Edit
  - 接收者：BoardScreen
  
- 根据分析画出初步的Uml图：

  ![](./src/uml/disignPicture/commandModeUml-0.png)

  

#### 3.实现

  - 命令接口：
  
    - Command:接口类，有一个抽象执行类execute()，和一个得到执行名称的类get()
  - 具体命令：
    - Copycommand：实现类，声明一个BoardScreen，调用其copy方法，返回copy名称。
    - OpenCommand：实现类，声明一个BoardScreen，调用其open方法，返回open名称。
    - CreateCommand：实现类，声明一个BoardScreen，调用其create方法，返回create名称。
    - PasteCommand：实现类，声明一个BoardScreen，调用其paste方法，返回paste名称。
    - Undo:实现类，撤销操作。声明一个BoardScreen，声明一个Arraylist用来操作接收者中的列表，执行的时候判断列表有没有值，如果有则调用undo方法，然后移除列表最后一项，然后更新接收者中的列表。返回空名称
  
  - 请求者：
    - Text:声明一个command，一个设置command的方法，一个点击执行的方法
    - Edit:声明一个command，一个设置command的方法，一个点击执行的方法
  
  - 接收者：
    - BoardScreen：接收者类，声明一个Arraylist用来存放操作步骤。所有的操作都是一句话然后将操作名称存入Arraylist中。



#### 4.体会

 将实际操作者和请求者分开，相当于给操作进行了封装，请求者不需要知道所有的操作方法和如何实现，只需要声明一个命令接口然后实例化一个封装好的具体命令就可以了。



#### 5.最终类图

![](./src/uml/resultPicture/Package Command.png)



------



### 二、策略模式

#### 声明：这里的排序是有实际代码

#### 1.题目

用策略模式设计一个排序系统（Sorter System），客户端可以动态地决定采用冒泡排序（Bubble Sort）、快速排序（Quick Sort）、归并排序（Merge Sort)、堆排序（Heap Sort）。



#### 2.分析

- 策略模式具有三个角色：策略、具体策略、上下文

- 根据题目：

  - 策略：SorterStrategy
  - 具体策略：BubbleSort、QuickSort、MergeSort、HeapSort
  - 上下文：SorterSystem

- 根据分析画出类图：

  - ![](./src/uml/disignPicture/strategyModeUml-0.png)

   





#### 3.实现

- SorterStrategy:接口类，只有一个sort()排序方法

- 具体策略:

  - BubbleSort:  <a href="https://blog.csdn.net/qq_41679818/article/details/90296399">冒泡引用</a>
  - QuickSort:  <a href="https://www.cnblogs.com/captainad/p/10999697.html">快排引用</a>
  - MergeSort: <a href="https://www.cnblogs.com/of-fanruice/p/7678801.html">归并引用</a>
  - HeapSort：<a href="https://www.cnblogs.com/luomeng/p/10618709.html">堆排序引用</a>
  
- 上下文：具有一个接口类，一个设定具体策略的方法，一个得到排序结果的方法。



#### 4.体会

 策略模式，将实现和使用解耦，后期增删都很方便，但是需要用户知道所有的策略。感觉和命令模式很相像。

 与命令模式做对比：

- 相同点
  - 都是封装，用户不需要知道具体的实现细节。
  - 调用接口，进行解耦
- 不同点
  - 针对不同目标：命令模式解决不同问题，策略模式解决一个问题的不同方法
  - 命令模式有一个执行者，如果将接收者和具体命令进行结合个人感觉和策略模式的实现方式一样。



#### 5.最终类图

![](./src/uml/resultPicture/Package Strategy.png)





