## 意图
通过测试持有锁的条件来减少实际能持有锁的线程数，只有通过测试条件后的线程才能去参与锁竞争，后续逻辑才会继续。

![alt text](./etc/double_checked_locking_1.png "Double Checked Locking")

## 能力

* 有同步线程进行对象创建，比如singleton，在多线程下的singleton
* 有同步线程访问一个方法，方法的行为会因为约束(判断)条件而发生改变，并且约束（判断）条件的变化在方法内部。
