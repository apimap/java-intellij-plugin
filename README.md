Apimap.io IntelliJ Plugin
===

🎉 **Welcome** 🎉

This is the home of the Apimap.io project, a freestanding solution to keep track of all functionality a company
provides through an API. It is a push based system, connected with your build pipeline or manually updated using our CLI.

> **Application programming interface (API)**: Point of functional integration between two or more systems connected 
> through commonly known standards

**Why is this project useful?** Lost track of all the API functionality provided inside your organization? Don't want
to be tied to an API proxy or management solution? The Apimap.io project uploads, indexes and enables discoverability of all
your organizations APIs. We care about the source code, removing the limitation of where the API is hosted and how your
network is constructed.

## Table of Contents

* [Project Components](#project-components)
* [Run](#run)
* [Contributing](#contributing)

I want to know more of the technical details and implementation guides: [DEVELOPER.md](DEVELOPER.md)

## Project Components
___
This is a complete software solution consisting of a collection of freestanding components. Use only the components you 
find useful, create the rest to custom fit your organization.

**Core**
- A **Developer Portal** with wizards and implementation information
- A **Discovery Portal** to display APIs and filter search results
- An **API** to accommodate all the information
- An **Orchestra API** to manage accounts and resource access
- A **CLI** to enable manual information uploads

**Plugins**
- A **GitHub Action** to automate information parsing and upload
- A **Jenkins plugin** to automate information parsing and upload
- An **IntelliJ plugin** to make it easier to write metadata and taxonomy files

## Run
___

This plugin must be installed from the IntelliJ marketplace.


## Contributing
___

Read [howto contribute](CONTRIBUTING.md) to this project.