
import threading

lockvar = threading.Lock()
print(lockvar)
lockvar.acquire()
print(lockvar)
lockvar.acquire() #--> deadlock!
#print(lockvar)

