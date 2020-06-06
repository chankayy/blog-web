.PHONY: proto
K8S_BLOG_HOME=~/work/k8s/blog

push:
	@git push origin master
deploy:
	@kubectl delete -f ${K8S_BLOG_HOME}/blog-web-deployment.yaml
	@kubectl create -f ${K8S_BLOG_HOME}/blog-web-deployment.yaml