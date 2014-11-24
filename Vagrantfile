# -*- mode: ruby -*-
# vi: set ft=ruby :

VAGRANTFILE_API_VERSION = "2"

$script = <<SCRIPT
sudo yum -y install java-1.8.0
SCRIPT

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|

	config.vm.define :springboot do |springboot|
		springboot.vm.box = "nrel/CentOS-6.5-x86_64"
	  	springboot.vm.network "forwarded_port", guest: 8080, host: 9090
  		springboot.ssh.forward_agent = true
  		springboot.vm.hostname = "boot-local.test.de" 
  		springboot.vm.synced_folder "target/libs", "/vagrant/"
  		springboot.vm.provision "shell", inline: $script
  	end
end
