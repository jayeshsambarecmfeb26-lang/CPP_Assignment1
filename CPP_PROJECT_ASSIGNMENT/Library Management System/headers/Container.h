#ifndef CONTAINER_H
#define CONTAINER_H

namespace LibrarySystem {

template <typename T>

class Container{

private:
    T* data;
    int size;
    int capacity;

public:

    Container(int cap=100){

        capacity=cap;
        size=0;
        data=new T[capacity];
    }

    ~Container(){
        delete[] data;
    }

    void add(const T& item){
        data[size++]=item;
    }

    int getSize() const{
        return size;
    }

    T& operator[](int index){
        return data[index];
    }

};

}

#endif
