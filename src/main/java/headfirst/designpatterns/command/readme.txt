SimpleRemote
-------
 The invoker class has 'Command' interface object. This objects execute() method is executed as an invoke process.
 Invoker.buttonPress() => triggers the execute method of the Command object it holds in that context.

 LightOn and LightOff are command implementations.
 Each of these classes implements the "Command" interface and has a service class that does its function in execute().
 execute() method of LightOn class will execute 'on' functionality of LightService
 execute() method of LightOn class will execute 'off' functionality of LightService