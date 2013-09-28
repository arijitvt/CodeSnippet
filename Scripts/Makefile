cc=g++
target=output
cpp_flags= -c 

objs=arijit.o

all:$(target)

$(target):$(objs)
	$(cc) $(objs) -o $@

%.o:%.cpp
	$(cc) $(cpp_flags) $<

clean:
	rm -rf *.o
	rm -rf $(target)
