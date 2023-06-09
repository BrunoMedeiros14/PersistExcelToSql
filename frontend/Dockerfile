FROM node:latest as build
WORKDIR /app
COPY package.json ./
RUN npm install
COPY . .
RUN npm run build

FROM nginx:alpine
COPY --from=build /app/dist/frontend /usr/share/nginx/html

# RUN echo "mainFileName=\"\$(ls /usr/share/nginx/html/main*.js)\" && \
#           envsubst '\$URL_BACKEND ' < \${mainFileName} > main.tmp && \
#           mv main.tmp  \${mainFileName} && nginx -g 'daemon off;'" > run.sh

EXPOSE 80
