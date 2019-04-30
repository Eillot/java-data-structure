package linear_list.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @version: java version 1.8+
 * @Author : zhouqing@blued.com
 * @Explain : 线性表的抽象类
 * @contact:
 * @Time : 2019-04-30  13:45
 * @File : absLinearList
 * @Software: IntelliJ IDEA 2018.3
 */
public abstract class absLinearList {

    // init  list .
    public List InitList(List mlist){
        mlist = new ArrayList();
        return mlist;
    }

    // list is null or no null .
    public Boolean ListisEmpty(List list){

        if (list!=null){
            return true;
        }else {
            return false;
        }
    }

    // clear list
    public void ClearList(List list){

        if (list !=null){
            for (int i = 0; i < list.size(); i++) {
                list.remove(i);
            }
            System.out.println("list clear is successfully .");

        }else {
            System.out.println("list clear is failed .");
        }
    }

    // get list position
    public Object getElem(List list,int position_number){

        Object object = null;
        if (list !=null){
            object = list.get(position_number);
            return object;
        }else {
            System.out.println("get list position is failed .");
            return null;
        }
    }

    // get value index
    public int getValueIndex(List list , Object obj) {

        if (list==null){
            return 0;
        }

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).equals(obj) == true)
            {
                return i;
            }
        }

    return 0;
    }

    // i position insert into list value.
    public Object[] insertList(Object[] list ,Object obj, int position_number){

        int obj_list_length = list.length;

        if(list==null){
            return null;
        }

        //0 1 (position)2 3 4
        for (int i = list.length-1; i >position_number-1; i--) {
            list[i+1] = list[i];
        }
        // position_number insert into obj .
        list[position_number]=obj;
        obj_list_length++;

        return list;
    }

    //delete list elem value
    public Object[] deleteListElem(Object[] list, Object obj,int delete_position_number){

        int obj_list_length = list.length;

        if (list==null){
            return null;
        }

        //0 1 2 3 4
        for (int i = list.length-1; i > delete_position_number; i--) {
            list[i-1] =list[i];
        }
        // position_number  delete value by i .
        list[delete_position_number]=obj;
        obj_list_length--;

        return list;
    }

    // get list elem account.
    public int getElemAccount(List list){

        int counter = 0;
        if(list ==null){
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            counter++;
        }
        return counter;
    }
}
