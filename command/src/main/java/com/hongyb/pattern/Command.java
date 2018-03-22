package com.hongyb.pattern;

/**
 * 命令
 * 作者:hongyanbo
 * 时间:2018/3/22
 *
 */
public abstract class Command {
    abstract void execute(Target target);
    abstract void undo();
    abstract void redo();
    @Override
    public abstract String toString() ;
}
