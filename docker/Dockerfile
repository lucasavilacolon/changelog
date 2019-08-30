FROM openjdk:7-jdk

USER root

RUN apt-get update && apt-get install -y

RUN apt-get --yes remove openjdk-7-jdk

#RUN apt-get --yes install openjdk-7-jdk

RUN apt-get -y install zip

RUN curl -s "https://get.sdkman.io" | bash

RUN /bin/bash -c "source $HOME/.sdkman/bin/sdkman-init.sh"

RUN /bin/bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && echo -n | sdk install java 8.0.222-zulu"

RUN /bin/bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && echo -n | sdk install grails 3.3.1"

RUN /bin/bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && echo -n | sdk install gradle 3.5"

#ENTRYPOINT ["/home/workspace/docker/scripts/dbm-update.sh"]
