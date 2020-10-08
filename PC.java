public class PC {
CPU cpu;
HardDisk HD;
void setCPU(CPU cpu){
this.cpu=cpu;
}
void setHardDisk(HardDisk HD){
this.HD=HD;
}
void show(){
System.out.print("CPU的速度："+cpu.getSpeed()+"\n"+"硬盘的容量："+HD.getAmount());
}
}